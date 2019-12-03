
public class ArvoreBinaria implements Arvore{
	Node root;
	
	@Override
	public boolean getElement(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void printPreOrder(Node aux) {
		if (aux != null) {
			System.out.println(aux.getValue() + ", ");
			printPreOrder(aux.getBefore());
			printPreOrder(aux.getNext());
		}
	}

	@Override
	public void printInOrder(Node aux) {
		printPosOrder(aux.getBefore());
		System.out.println(aux.getValue() + ", ");
		printPosOrder(aux.getNext());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printPosOrder(Node aux) {
		if (aux != null) {
			printPosOrder(aux.getBefore());
			printPosOrder(aux.getNext());
			System.out.println(aux.getValue() + ", ");
		}
	}

	@Override
	public void insert(Object chave) {
		
	}

	@Override
	public Object min() {
		Node aux = root;
		Object ret = null;
		if (aux != null) {
			while (aux.getBefore() != null) {
				aux = aux.getBefore();
			}
			ret = aux.getValue();
		}
		return ret;
	}

	@Override
	public Object max() {
		Node aux = root;
		Object ret = null;
		if (aux != null) {
			while (aux.getNext() != null) {
				aux = aux.getNext();
			}
			ret = aux.getValue();
		}
		return ret;
	}

	@Override
	public void remove(Object value) {
		Node aux = root;
	}

	@Override
	public Object countElements() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
