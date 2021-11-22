package ListaEncadeada;

public class Lista<T>{

    private No<T> refEntrada;

    public Lista(){
        this.refEntrada = null;
    }

    private No<T> getRefEntrada() {
        return refEntrada;
    }

    private void setRefEntrada(No<T> refEntrada) {
        this.refEntrada = refEntrada;
    }

    public int size(){
        int cont = 0;
        No<T> aux = this.refEntrada;
        while(aux!=null){
            cont++;
            aux = aux.getRefNo();
        }
        return cont;
    }

    public boolean isEmpty(){
        return this.refEntrada == null?true:false;
    }

    public void add(T conteudo){
        No<T> newNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.refEntrada= newNo;
            return;
        }

        No<T> aux = this.getNo(this.size()-1);
        aux.setRefNo(newNo);
        newNo.setRefNo(null);
    }

    public void add(T conteudo, int index){
        validaIndice2(index);
        No<T> newNo = new No<>(conteudo);
        if(this.isEmpty()){
            this.refEntrada= newNo;
            return;
        }
        if(index == this.size()){
            No<T> aux = this.getNo(index-1);
            aux.setRefNo(newNo);
            return;
        }
        if(index == 0){
            newNo.setRefNo(this.refEntrada);
            this.refEntrada = newNo;
            return;
        }
        No<T> aux = this.getNo(index);
        No<T> aux2 = this.getNo(index-1);
        newNo.setRefNo(aux);
        aux2.setRefNo(newNo);
    }

    public void remove(int index){
        validaIndice(index);
        if(index == 0){
            this.refEntrada = refEntrada.getRefNo();
            return;
        }
        if(index == this.size()-1){
            No<T> aux = this.getNo(index-1);
            aux.setRefNo(null);
            return;
        }
        No<T> aux = this.getNo(index-1);
        aux.setRefNo(this.getNo(index+1));
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> aux = this.refEntrada;
        for(int i = 0; i < index;i++){
            aux = aux.getRefNo();
        }
        return aux;

    }

    private void validaIndice(int index){
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Index limit");
        }
    }
    private void validaIndice2(int index){
        if(index > this.size()){
            throw new IndexOutOfBoundsException("Index Limit");
        }
    }

    @Override
    public String toString() {
        String str = "[ ";
        No<T> aux = this.refEntrada;
        while(aux!=null){
            str += aux.getConteudo() + ", ";
            aux = aux.getRefNo();
        }
        str += "]";
        return str;
    }
}
