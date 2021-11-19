package pilha;

public class Pilha<T>{
	
	private No<T> refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public No<T> top() {
		return this.refNoEntradaPilha;
	}
	
	public void push(T object) {
		No<T> refauxiliar = this.refNoEntradaPilha;
		No<T> novoNo = new No<>(object);
		this.refNoEntradaPilha =  novoNo;
		this.refNoEntradaPilha.setRefNo(refauxiliar);
	}
	
	
	public No<T> pop() {
		No<T> refPoped = this.refNoEntradaPilha;
		this.refNoEntradaPilha = this.refNoEntradaPilha.getRefNo();
		return refPoped;
	}
	
	public boolean isEmpty() {
		return this.refNoEntradaPilha == null ? true : false;
	}
	
	public int size() {
		int contador=0;
		if(!this.isEmpty()) {
			No<T> newno = this.refNoEntradaPilha;
			while(newno != null) {
				contador+=1;
				newno = newno.getRefNo();
				}
		}
		return contador;
	}
	
	public String toString() {
		
		String stringretorno = "------------\n";
		stringretorno += "Pilha\n";
		stringretorno+="------------\n";
		
		No<T> noAuxiliar = this.refNoEntradaPilha;
		
		while(true) {
			
			if(noAuxiliar != null) {
				stringretorno += noAuxiliar.toString()+"\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
			
		}
		stringretorno+="------------\n";
		return stringretorno;
		
	}
	
}