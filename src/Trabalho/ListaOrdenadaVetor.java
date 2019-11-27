package Trabalho;

public class ListaOrdenadaVetor implements ListaOrdenada {

	private Integer vector[];
	private int count;
	
	public ListaOrdenadaVetor(int length) {
		this.count = 0;
		this.vector = new Integer[length];
	}
	
	@Override
	public boolean isFull() {
		return count == vector.length - 1;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public void Insert(Integer value) {
		if (!isFull()) {
			int position = 0;
			for (int i = 0; i < count; i++) {
				if (vector[i] < value) {
					position = i + 1;
				}
			}
			for(int i=count-1; i>=position; i--) {
				vector[i+1] = vector[i];
			}
			vector[position] = value;
			count++;
		}else {
			System.out.println("Lista Cheia");
		}
	}

	@Override
	public Integer Remove(int position) {
		if (!isEmpty() && position < count && position >= 0) {
			Integer aux = vector[position];
			for (int i = position; i <= count; i++) {
				vector[i] = vector[i+1];
			}
			count--;
			return aux;
		}else {
			System.out.println("Posição Invalida");
			return null;
		}
	}

	@Override
	public int Size() {
		return count;
	}

	@Override
	public boolean Find(Integer value) {
		boolean find = false;
		for(int i = 0; i < count; i++) {
			if(vector[i] == value)
				find = true;
		}
		return find;
	}

	@Override
	public Integer Get(int position) {
		if(!isEmpty() && position < count && position >= 0)
			return vector[position];
		else
			System.out.println("Posição Invalida");
			return null;
	}

	@Override
	public void Print() {
		System.out.print('[');
		for(int i = 0; i < count; i++) {
			if (i == count - 1)
				System.out.print(vector[i]);
			else
				System.out.print(vector[i] + ", ");
		}
		System.out.println(']');
	}

}
