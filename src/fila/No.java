package fila;

public class No<T> {
	No<T> refNo;
	T object;
	
	
	public No(T object) {
		this.refNo = null;
		this.object = object;
	}
	
	

	public No<T> getRefNo() {
		return refNo;
	}

	public void setRefNo(No<T> refNo) {
		this.refNo = refNo;
	}


	public T getObject() {
		return this.object;
	}

	public void setObject(T object) {
		this.object = object;
	}


	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
	
}
