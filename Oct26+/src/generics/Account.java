package generics;


public class Account<T extends String> {
	T obj;

	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}	
}

