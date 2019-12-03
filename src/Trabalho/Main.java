package Trabalho;

public class Main {

	public static void main(String[] args) {
		ListaOrdenada l1 = new ListaOrdenadaVetor(10);
		l1.Insert(4);
		l1.Insert(1);
		l1.Insert(3);
		l1.Insert(2);
		l1.Insert(5);
		l1.Insert(3);
		l1.Print();
		
		ListaOrdenada l2 = new ListaOrdenadaEncadeada();
		l2.Insert(20);
		l2.Insert(10);
		l2.Insert(30);
		l2.Insert(34);
		l2.Insert(20);
		l2.Insert(35);
		l2.Insert(-2);
		l2.Print();
	
		
		ListaOrdenada l3 = new ListaOrdenadaDuplamenteEncadeada();
		l3.Insert(10);
		l3.Insert(20);
		l3.Insert(5);
		l3.Insert(20);
		l3.Print();
		
		
	}
}
