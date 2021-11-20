package listaEncadeada;

import fila.No;

public class Lista<T>{
	
	No<T> refNoEntrada;
	
	public Lista() {
		this.refNoEntrada = null;
	}

	public boolean isEmpty() {
		return this.refNoEntrada == null?true:false;
	}
	
	public int size() {
		No<T> newNo = this.refNoEntrada;
		int contador=0;
		if(!this.isEmpty()) {
			while(newNo != null) {
				contador+=1;
				newNo = newNo.getRefNo();
			}
		}
		return contador;
	}
	
	public void push(T object) {
		No<T> newno = new No<>(object);
		newno.setRefNo(this.refNoEntrada);
		this.refNoEntrada = newno;
	}
	
	public void add(T object,int index) {
		
		No<T> newno = new No<>(object);	
		int cont=0;
		No<T> noauxiliar = this.refNoEntrada;
		
		if(this.size() - index == 0) {
			newno.setRefNo(this.refNoEntrada.getRefNo());
			this.refNoEntrada.setRefNo(newno);
		}else if(this.size() - index == 1) {
			newno.setRefNo(this.refNoEntrada.getRefNo().getRefNo());
			this.refNoEntrada.getRefNo().setRefNo(newno);
		}else {
			cont = 0;
			while(cont < (this.size()-index)) {
				
				noauxiliar = noauxiliar.getRefNo();
				cont++;
			}
			newno.setRefNo(noauxiliar.getRefNo());
			noauxiliar.setRefNo(newno);
		}
		
	}
	
	public T remove(int index){
		
		if(this.refNoEntrada != null) {
			
			if(index == 0) {
				No<T> auxiliar = this.refNoEntrada.getRefNo();
				T aux2 = this.refNoEntrada.getObject();
				this.refNoEntrada.setRefNo(null);
				this.refNoEntrada = auxiliar;
				return aux2;
				
			}else if(index == 1) {
				No<T> noremovido = this.refNoEntrada;
				this.refNoEntrada.setRefNo(this.refNoEntrada.getRefNo().getRefNo());
				return noremovido.getObject();
			}
			int cont=0;
			No<T> aux2 = this.refNoEntrada;
			while(cont <= index) {
				aux2 = aux2.getRefNo();
				cont++;
			}
			No<T> noremovido = aux2.getRefNo();
			aux2.setRefNo(aux2.getRefNo().getRefNo());
			return noremovido.getObject();
	}else {
			return null;
		}
	}

	public String toString() {
		String toString = "[ ";
		No<T> newNo = this.refNoEntrada;
		if(!this.isEmpty()) {
			while(newNo!=null) {
				toString += newNo.getObject()+", ";
				newNo = newNo.getRefNo();
			}
		}else {
			return "null";
		}
		toString += "]";
		return toString;	
	}
	
	
	
}
