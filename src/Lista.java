
public interface Lista {
	
	public boolean isFull();
	public boolean isEmpty();
	
	public void Insert(Object value);
	public void Insert(Object value, int position);
	public Object Remove(int position);
	
	public int Size();
	public boolean Find(Object value);
	public Object Get(int position);
	
	public void Print();
	
}
