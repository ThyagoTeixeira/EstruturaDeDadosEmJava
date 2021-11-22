package ListaDuplamenteEncadeada;

public class ListaDupla<T>{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDupla() {
        this.primeiroNo= null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo){
        NoDuplo<T> aux = new NoDuplo<>(conteudo);
        aux.setNoProximo(null);
        aux.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            this.primeiroNo = aux;
        }
        if(ultimoNo != null){
            this.ultimoNo.setNoProximo(aux);
        }
        this.ultimoNo = aux;
        this.tamanhoLista++;
    }

    public void add(T conteudo, int index){
        NoDuplo<T> aux = this.getNo(index);
        NoDuplo<T> newno = new NoDuplo<>(conteudo);
        newno.setNoProximo(aux);
        if(newno.getNoProximo() != null){
            newno.setNoPrevio(aux.getNoPrevio());
            newno.getNoProximo().setNoPrevio(newno);
        }else{
            newno.setNoPrevio(ultimoNo);
            ultimoNo = newno;
        }

        if(index == 0){
            primeiroNo = newno;
        }else{
            newno.getNoPrevio().setNoProximo(newno);
        }

        tamanhoLista++;

    }

    public NoDuplo<T> getNo(int index){
        NoDuplo<T> aux = this.primeiroNo;
        for (int i=0; (i < index) && (aux!=null);i++){
            aux = aux.getNoProximo();
        }
        return aux;
    }

    public int size(){
        return this.tamanhoLista;
    }

}
