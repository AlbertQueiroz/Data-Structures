
public class FilaVetor implements Fila{
	private Object vector[];
	private int count = 0;
	
	public FilaVetor(int size) {
		vector = new Object[size];
	}

	@Override
	public void enqueue(Object value) {
		if (!isFull()) {
			vector[count] = value;
			count++;
		} else {
			System.out.println("Fila Cheia");
		}
	}

	@Override
	public Object dequeue() {
		if(!isEmpty()) {
			Object aux = vector[0];
			for(int i = 0; i<=count; i++) {
				vector[i] = vector[i+1];
				vector[i+1] = null;
			}
			count--;
			return aux;
		}else {
			System.out.println("Fila Vazia");
			return null;
		}
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
	public void Print() {
		for(int i = 0; i<count; i++) {
			System.out.println(vector[i]);
		}
	}
}
