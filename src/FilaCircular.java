
public class FilaCircular implements Fila {
	private Node first;
	private Node last;
	
	
	@Override
	public void enqueue(Object value) {
		Node input = new Node();
		input.setValue(value);
		input.setNext(null);
		if(isEmpty()) {
			first = input;
			last = input;
			last.setNext(first);
		}else {
			last.setNext(input);
			last = input;
			last.setNext(first);
		}
	}
	
	@Override
	public Object dequeue() {
		if(!isEmpty()) {
			Node aux = first;
			first = first.getNext();
			last.setNext(first);
			return aux;
		}else {
			System.out.println("Fila Vazia");
			return null;
		}
	}
	
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	@Override
	public void Print() {
		Node aux = first;
		System.out.print('[');
		System.out.print(aux.getValue() + ", ");
		while(aux.getNext() != first) {
			aux = aux.getNext();
			if(aux.getNext() == first) {
				System.out.print(aux.getValue());
			}else {
				System.out.print(aux.getValue() + ", ");	
			}
		}
		System.out.println(']');
	}
	
	
}
