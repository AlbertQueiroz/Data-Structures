package Trabalho;

public class Node {
	
	private Integer value;
	private Node before;
	private Node next;
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
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
