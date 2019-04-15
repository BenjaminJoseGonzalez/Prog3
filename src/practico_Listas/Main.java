package practico_Listas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		System.out.println("Lista vacia?: "+list.isEmpty());
		System.out.println("Cargando nodos 1, 2, 3, 4, 5 ...");
		
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		
		
		System.out.println("Lista vacia?: "+list.isEmpty());
		System.out.println("print: list:");
		list.print(5);
		
		System.out.println("creando nueva lista: list2...");
		
		LinkedList sList = new LinkedList();
		sList.insertFirst(15);
		sList.insertFirst(2);
		sList.insertFirst(9);
		sList.insertFirst(4);
		sList.insertFirst(7);
		
		System.out.println("generando lista dada lista y lista2");
		
		LinkedList kList = list.genSharedList(list, sList);
		int ks = kList.getSize();
		kList.print(ks);
		System.out.println("generando una lista de tamaño 50");
		LinkedList tList = new LinkedList();
		tList.loadList(50, tList);
		tList.print(tList.getSize());
		
	}

}
