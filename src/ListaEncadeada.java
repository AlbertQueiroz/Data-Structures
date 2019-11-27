
public class ListaEncadeada implements Lista{
	private Node first = null;
	private int count = 0;
	
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	@Override
	public void Insert(Object value) {
		Node input = new Node();
		input.setValue(value);
		input.setNext(null);
		if(isEmpty()) {
			first = input;
		} else {
			Node last = first;
			while(last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(input);
		}
		count++;
	}
	
	@Override
	public void Insert(Object value, int position) {
		if(!isEmpty() && position>=0 && position<count) {
			Node aux = first;
			Node before = null;
			Node input = new Node();
			input.setValue(value);
			input.setNext(null);
			for(int i=0; i<position; i++) {
				before = aux;
				aux = aux.getNext();
			}
			input.setNext(aux);
			if(aux == first) {
				first = input;
			}else {
				before.setNext(input);
			}
		}else {
			System.out.println("Posição Invalida");
		}
	}
	
	@Override
	public Object Remove(int position) {
		if(!isEmpty()) {
			Node aux = first;
			Node before = null;
			for(int i=0; i<position; i++) {
				before = aux;
				aux = aux.getNext();
			}
			before.setNext(aux.getNext());
			return aux;
		} else {
			System.out.println("Lista Vazia");
			return null;
		}
	}
	@Override
	public void Print() {
		Node aux = first;
		System.out.print('[');
		while(aux != null) {
			if(aux.getNext() == null) {
				System.out.print(aux.getValue());
			}else {
				System.out.print(aux.getValue() + ", ");	
			}
			aux = aux.getNext();
		}
		System.out.println(']');
	}
	
	@Override
	public int Size() {
		return count;
	}
	
	@Override
	public boolean Find(Object value) {
		Node aux = first;
		while(aux!=null) {
			if(aux.getValue() == value) {
				return true;
			}
			aux = aux.getNext();
		}
		return false;
	}
	
	@Override
	public Object Get(int position) {
		if(!isEmpty() && position>=0 && position<count) {
			Node aux = first;
			for(int i=0; i<position; i++) {
				aux = aux.getNext();
			}
			return aux.getValue();
		} else {
			System.out.println("Posição Invalida");
			return null;
		}
	}	
}
