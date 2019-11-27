package Trabalho;

public class ListaOrdenadaEncadeada implements ListaOrdenada{
	private Node first;
	private int count;

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public void Insert(Integer value) {
		Node input = new Node();
		input.setValue(value);
		input.setNext(null);
		if(isEmpty()) {
			first = input;
		}else {
			Node aux = first;
			while(aux.getNext().getValue() < value) {
				aux = aux.getNext();
			}
			input.setNext(aux.getNext());
			aux.setNext(input);
		}
		count++;
	}

	@Override
	public Integer Remove(int position) {
		if(!isEmpty()) {
			Node aux = first;
			Node before = null;
			for(int i=0;i<position;i++) {
				before = aux;
				aux = aux.getNext();
			}
			Integer value = aux.getValue();
			before.setNext(aux.getNext());
			return value;
		}else {
			System.out.println("Lista Vazia");
			return null;
		}
	}

	@Override
	public int Size() {
		return count;
	}

	@Override
	public boolean Find(Integer value) {
		boolean found = false;
		if(!isEmpty()) {
			Node aux = first;
			while(aux != null) {
				if(aux.getValue() == value) {
					found = true;
				}
				aux = aux.getNext();
			}		
		}else {
			System.out.println("Lista Vazia");
		}
		return found;		
	}
	
	@Override
	public Integer Get(int position) {
		if(!isEmpty()) {
			Node aux = first;
			for(int i=0;i<position;i++) {
				aux = aux.getNext();
			}
			return aux.getValue();
		}else{
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
	
}
