package practico_Listas;

public class LinkedList implements Iterable<Object>{
	private Node root;
	private int size;
	
	public LinkedList() {
		this.root = null;
		this.size = 0;//initial size in 0;
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public void insertFirst(Object o) {
		Node tmp = new Node(o,null);
		tmp.setNext(root);
		this.root = tmp;
		this.size++;//increment size;
	}
	public Object extractFirst() {
		Node n = this.root;//keep the root;
		this.root = this.root.getNext();//change root to next;
		return n;//return root;
	}
	public Node getNode(int n) {
		Node tmp = null;
		if((n>=0)&&(n<this.getSize())) {//verify range
			tmp = this.root;
			for (int i = 0; i < n; i++) {
				tmp = tmp.getNext();
			}
		}	
		return tmp;
	}
	public void print(int i) {
		Node n = new Node();
		n = this.root;
		if(i > this.size) {
			System.out.println("out of range");
		}
		for (int j = 0; j < i; j++) {
			System.out.println(n);
			n = n.getNext();
		}
	}
	@Override
	public String toString() {
		return "LinkedList [root=" + root + ", size=" + size + "]";
	}
	public boolean isEmpty() {
		return this.root == null;
	}
	public int getSize() {
		return this.size;
	}
	private void setSize(int s) {
		this.size = s;
	}
	@Override
	public MyIteratorList iterator() {
		MyIteratorList it = new MyIteratorList(root);
		return it;
	}
	public LinkedList genSharedList(LinkedList fl, LinkedList sl) {
		LinkedList returnList = new LinkedList();
		Node n = new Node();
		for(int i=0;i<fl.getSize();i++) {
			if(fl.getNode(i).getInfo() != sl.getNode(i).getInfo() && (i< sl.getSize())) {
				n = fl.getNode(i);
				returnList.insertFirst(n);
			}
			
		}
			
		return returnList;
	}
	public boolean equals(Node n) {
		return (root.getInfo() == n.getInfo());
	}
	public void loadList(int size, LinkedList l) {
		int n = 0;
		for(int i=0;i<size;i++) {
			n = (int)Math.random()+size;
			l.insertFirst(n);
		}
	}

}
