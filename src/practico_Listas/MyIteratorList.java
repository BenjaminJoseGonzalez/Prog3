package practico_Listas;

import java.util.Iterator;

public class MyIteratorList implements Iterator<Object> {
	private Node n;
	
	public MyIteratorList(Node n) {
		this.n = n; 
	}

	@Override
	public boolean hasNext() {
		return n != null;
	}

	@Override
	public Object next() {
		Node tmp;
		tmp = n;//save node n;
		n = n.getNext();//change n to next;
		return tmp;//return n;
	}

}
