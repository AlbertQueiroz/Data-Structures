
public interface Arvore {
	public boolean getElement(Object key);
	public void printPreOrder(Node aux);
	public void printInOrder(Node aux);
	public void printPosOrder(Node aux);
	public void insert(Object chave);
	public Object min();
	public Object max();
	public void remove(Object value);
	public Object countElements();
	
}
