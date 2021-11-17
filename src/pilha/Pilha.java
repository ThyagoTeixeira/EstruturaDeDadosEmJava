package pilha;

public class Pilha {
	
	private No refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public No top() {
		return this.refNoEntradaPilha;
	}
	
	public void push(No novoNo) {
		No refauxiliar = this.refNoEntradaPilha;
		this.refNoEntradaPilha = novoNo;
		this.refNoEntradaPilha.setRefNo(refauxiliar);
	}
	
	
	public No pop() {
		No refPoped = this.refNoEntradaPilha;
		this.refNoEntradaPilha = this.refNoEntradaPilha.getRefNo();
		return refPoped;
	}
	
	public boolean isEmpty() {
		return this.refNoEntradaPilha == null ? true : false;
	}
	
	public String toString() {
		
		String stringretorno = "------------\n";
		stringretorno += "Pilha\n";
		stringretorno+="------------\n";
		
		No noAuxiliar = this.refNoEntradaPilha;
		
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

