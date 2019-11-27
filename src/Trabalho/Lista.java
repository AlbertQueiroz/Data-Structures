package Trabalho;

public interface Lista {
	
	public boolean isFull();
	public boolean isEmpty();
	
	public void Insert(Integer value);
	public void Insert(Integer value, int position);
	public Integer Remove(int position);
	
	public int Size();
	public boolean Find(Integer value);
	public Integer Get(int position);
	
	public void Print();
}
