package listaEncadeada;

public class No<T> {
	No<T> proximoNo;
	private T conteudo;
	
	public No() {
		this.proximoNo = null;
	}
	
	public No(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	public String toStringEncadeado() {
		String str =  "No [conteudo=" + conteudo + "]";
		while(this.proximoNo != null) {
			str += "--> ";
			str += this.proximoNo.toString();
		}
		str += "--> null";
		return str;
	}
	
}
