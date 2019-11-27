
public class FilaEncadeada implements Fila{
	
	private Node first;
	private Node last;
	
	@Override
	public void enqueue(Object value) {
		Node novo = new Node();
		novo.setValue(value);
		novo.setNext(null);
		if(isEmpty()) {
			first = novo;
			last = novo;
		} else {
			last.setNext(novo);
			last = novo;
		}
	}

	@Override
	public Object dequeue() { 
		if(!isEmpty()) {
			Node aux = first;
			first = first.getNext();
			return aux.getValue();
		} else {
			System.out.println("Lista Vazia");
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
	
	public void Print() {
		Node aux = first;
		while(aux != null) {
			System.out.println(aux.getValue());
			aux = aux.getNext();
		}
	}

}
