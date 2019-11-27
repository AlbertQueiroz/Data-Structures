import Trabalho.ListaDuplamenteEncadeada;

public class Main {
	public static void main(String[] args) {
		
		Pilha p1 = new PilhaEncadeada();
		p1.push(10);
		p1.push("Albert");
		p1.push('a');
		
		System.out.println(p1.pop());
		System.out.println(p1.pop());
		System.out.println(p1.pop());
		
		Fila f1 = new FilaEncadeada();
		f1.enqueue("Rayneer");
		f1.enqueue(25);
		f1.enqueue(40);
		f1.enqueue(35);
		System.out.println(f1.dequeue());
		System.out.println(f1.dequeue());
		System.out.println(f1.dequeue());
		System.out.println(f1.dequeue());
		
		Lista l1 = new ListaVetor(20);
		l1.Insert(90);
		l1.Insert("Albert");
		l1.Insert("Cu", 0);
		System.out.println(l1.Size());
		l1.Print();
		System.out.println(l1.Remove(1));
		System.out.println(l1.Remove(0));
		
		Lista l2 = new ListaEncadeada();
		l2.Insert(10);
		l2.Insert(20);
		l2.Insert("Raji");
		l2.Insert('a');
		l2.Print();
		l2.Insert("CU", 0);
		l2.Print();
		System.out.println(l2.Find(20));
		System.out.println(l2.Get(3));
		l2.Remove(1);
		l2.Print();
		l2.Get(2);
		l2.Insert(45, 1);
		
		
		Fila f2 = new FilaVetor(10);
		f2.enqueue("Albert");
		f2.enqueue("Raji");
		f2.enqueue("Felipe");
		System.out.println(f2.dequeue());
		System.out.println(f2.dequeue());
		System.out.println(f2.dequeue());
		
		
		Pilha p2 = new PilhaVetor(10);
		p2.push(40);
		p2.push(20);
		System.out.println(p2.pop());
		System.out.println(p2.pop());
		
		Fila f3 = new FilaCircular();
		f3.enqueue("Albert");
		f3.enqueue("Raji");
		f3.enqueue("Kilmer");
		f3.enqueue(22);
		f3.Print();
		f3.enqueue("CU");
		f3.Print();
		
		
		Fila f4 = new FilaVetorCircular(10);
		f4.enqueue(10);
		f4.enqueue("Kilmer");
		f4.enqueue("Bla");
		f4.Print();
		System.out.println(f4.dequeue());
		System.out.println(f4.dequeue());
		System.out.println(f4.dequeue());
		System.out.println(f4.dequeue());
		}
}
