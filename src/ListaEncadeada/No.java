package ListaEncadeada;

public class No <T>{
    No<T> refNo;
    T conteudo;

    public No(T conteudo){
        this.refNo = null;
        this.conteudo = conteudo;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }



}
