package Trabalho;

public interface ListaOrdenada {
	
	public boolean isFull();
	public boolean isEmpty();
	
	public void Insert(Integer value);
	public Integer Remove(int position);
	
	public int Size();
	public boolean Find(Integer value);
	public Integer Get(int position);
	
	public void Print();
	
}
