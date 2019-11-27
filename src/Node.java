
public class Node {
	private Object value;
	private Node before;
	private Node next;
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getBefore() {
		return before;
	}
	public void setBefore(Node before) {
		this.before = before;
	}
	
	
}
