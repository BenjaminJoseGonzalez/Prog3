package practico_Listas;

public class Node {
	private Object info;
	private Node next;
	
	public Node() {
		info = null;
		next = null;
	}
	public Node(Object o, Node n) {
		setInfo(o);
		setNext(n);
	}
	public void setNext(Node n) {
		this.next = n;
	}
	public void setInfo(Object o) {
		this.info = o;
	}
	public Node getNext() {
		return this.next;
	}
	public Object getInfo() {
		return this.info;
	}
	public String toString() {
		return "Node [" + info + "]";
	}
	
	
	
}
