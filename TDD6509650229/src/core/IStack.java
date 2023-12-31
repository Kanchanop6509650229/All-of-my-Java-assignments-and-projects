package core;

public interface IStack {
	public int getSize();
	public boolean isEmpty();
	public void pushStack(Object item) throws Exception;
	public boolean isFull();
	public Object top();
	public Object pop();
}
