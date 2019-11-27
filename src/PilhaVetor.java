
public class PilhaVetor implements Pilha{
	private Object vector[];
	private int top = -1;
	
	public PilhaVetor(int tamanho) {
		vector = new Object[10];
	}

	@Override
	public void push(Object value) {
		if(!isFull()) {
			top += 1;
			vector[top] = value;		
		}else {
			System.out.println("Pilha Cheia");
		}
	}

	@Override
	public Object pop() {
		if(!isEmpty()) {
			Object aux = vector[top];
			top--;
			return aux;
		}else {
			System.out.println("Pilha Vazia");
			return null;
		}
	}

	@Override
	public boolean isFull() {
		return top == vector.length;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

}
