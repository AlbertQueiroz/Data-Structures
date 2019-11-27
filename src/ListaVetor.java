
public class ListaVetor implements Lista {
	private Object vector[];
	private int count = 0;
	
	public ListaVetor(int tamanho) {
		vector = new Object[tamanho];
	}

	@Override
	public boolean isFull() {
		return count > vector.length;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public void Insert(Object value) {
		if(!isFull()) {
			vector[count] = value;
			count++;
		}else {
			System.out.println("Lista Cheia");
		}
	}
	
	@Override
	public void Insert(Object value, int position) {
		if(position>=0 && position<=count) {
			for(int i=count-1; i>=position; i--) {
				vector[i+1] = vector[i];
			}
			vector[position] = value;
			count++;
		}else {
			System.out.println("Posição Invalida");
		}
	}
	
	@Override
	public Object Remove(int position) {
		if(!isEmpty() && position>=0 && position<count) {
			Object aux = vector[position];
			for(int i=position; i<count; i++) {
				vector[i] = vector[i+1];
				vector[i+1] = null;
			}
			count--;
			return aux;
		}else {
			System.out.println("Posição Invalida");
			return null;
		}
		
	}
	
	public void Print() {
		System.out.print('[');
		for(int i=0; i<count; i++) {
			if(i<count-1) {
				System.out.print(vector[i] + ", ");
			}else {
				System.out.print(vector[i]);
			}
		}
		System.out.println(']');
	}

	@Override
	public int Size() {
		return count;
	}

	@Override
	public boolean Find(Object value) {
		boolean aux = false;
		for(int i=0; i<count; i++) {
			if (vector[i] == value) {
				aux = true;
			}
		}
		return aux;
	}

	@Override
	public Object Get(int position) {
		if(!isEmpty() && position>=0 && position<count) {
			return vector[position];
		}else {
			System.out.println("Posicao Invalida");
			return null;
		}
	}
	
	
}
