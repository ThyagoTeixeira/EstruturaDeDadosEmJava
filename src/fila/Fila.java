package fila;

public class Fila<T>{
	
	private No<T> refNoEntradaFila;
	
	public Fila(){
		this.refNoEntradaFila = null;
	}
	
	public boolean isEmpty() {
		return this.refNoEntradaFila == null ? true : false;
	}
	
	public void enqueue(T object) {
		No<T> novoNo = new No<>(object);
		novoNo.setRefNo(this.refNoEntradaFila);
		this.refNoEntradaFila = novoNo;
		
	}
	public No<T> dequeue() {
		No<T> newNo = this.refNoEntradaFila;
		
		if(!this.isEmpty() && newNo.getRefNo() != null) {
			while(newNo.getRefNo().getRefNo() != null) {
				newNo = newNo.getRefNo();
			}
		}else {
			this.refNoEntradaFila = null;
			return null;
			}
		No<T> noexcluido = newNo.getRefNo();
		newNo.setRefNo(null);
		return noexcluido;
		}
	
	
	public No<T> first() {
		
		No<T> newno = this.refNoEntradaFila;
		if(!this.isEmpty()) {
			while(newno.getRefNo() != null) {
				newno = newno.getRefNo();
			}
		}
		return newno;
	}
	public int size() {
		No<T> newNo = this.refNoEntradaFila;
		int contador=0;
		if(!this.isEmpty()) {
			while(newNo != null) {
				contador+=1;
				newNo = newNo.getRefNo();
			}
		}
		return contador;
	}

	@Override
	public String toString() {
		String toString = "----------\n";
		toString += "FILA\n";
		toString += "----------\n";
		No<T> newNo = this.refNoEntradaFila;
		if(!this.isEmpty()) {
			while(newNo!=null) {
				toString += newNo+"\n";
				newNo = newNo.getRefNo();
			}
		}else {
			return "null";
		}
		return toString;	
	}
	
	
	
}
