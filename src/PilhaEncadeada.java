
public class PilhaEncadeada implements Pilha {

	private Node top;
	
	@Override
	public void push(Object value) {
		Node novo = new Node();
		novo.setValue(value);
		if(isEmpty()) {
			novo.setNext(null);
			top = novo;
		} else {
			novo.setNext(top);
			top = novo;
		}
	}
	
	@Override
	public Object pop() {
		if(!isEmpty()) {
			Node aux = top;
			top = top.getNext();
			return aux.getValue();
		}else {
			System.out.println("Pilha Vazia");
			return null;
		}
		
	}
	
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		return top == null;
	}
	
	
}
