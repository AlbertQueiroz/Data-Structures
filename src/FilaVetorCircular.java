
public class FilaVetorCircular implements Fila {
	private Object vector[];
	private int count = 0;
	private int first = 0;
	private int last = 0;
	
	public FilaVetorCircular(int size) {
		vector = new Object[size];
	}

	@Override
	public void enqueue(Object value) {
		if(!isFull()) {
			vector[last] = value;
			last = (last+1)%vector.length;
			count++;
		}else {
			System.out.println("Fila Cheia");
		}
	}

	@Override
	public Object dequeue() {
		if(!isEmpty()) {
			Object aux = vector[first];
			first = (first+1)%vector.length;
			count--;
			return aux;	
		}else {
			System.out.println("Fila Vazia");
			return null;
		}
			}

	@Override
	public boolean isFull() {
		return count == vector.length;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public void Print() {
		System.out.print('[');
		for(int i = first; i<last; i++) {
			if(i==last-1) {
				System.out.print(vector[i]);
			}else {
				System.out.print(vector[i] + ", ");	
			}
		}
		System.out.println(']');
	}
	
	
}
