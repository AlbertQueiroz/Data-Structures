package Trabalho;

public class ListaOrdenadaDuplamenteEncadeada implements ListaOrdenada {
	private Node first;
	private int count;
	
	@Override
	public boolean isFull() {
		return false;
	}
	
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	@Override
	public void Insert(Integer value) {
		Node input = new Node();
		input.setValue(value);
		input.setBefore(null);
		input.setNext(null);
		if(isEmpty()) {
			first = input;
		} else {
			Node aux = first;
			while(aux.getValue() < value && aux.getNext() != null) {
				aux = aux.getNext();
			}if (aux == first && aux.getValue() > value) {
				input.setNext(aux);
				aux.setBefore(input);
				first = input;
				
			}else if (aux.getValue() > value){
				aux.getBefore().setNext(input);
				input.setNext(aux);
				aux.setBefore(input);
			}else{
				input.setBefore(aux);
				input.setNext(aux.getNext());
				aux.setNext(input);
			}
		count++;
		}
	}

	@Override
	public Integer Remove(int position) {
		if(!isEmpty()) {
			Node aux = first;
			for(int i=0;i<position;i++) {
				aux = aux.getNext();
			}
			Integer value = aux.getValue();
			aux.getBefore().setNext(aux.getNext());
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


