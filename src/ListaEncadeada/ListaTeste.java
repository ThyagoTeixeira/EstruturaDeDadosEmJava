package ListaEncadeada;

public class ListaTeste {
    public static void main(String[] args) {
        Lista<String> minhalista = new Lista<>();

        minhalista.add("ttt",0);
        minhalista.add("ttdt",1);
        minhalista.add("ttx23");
        minhalista.add("tnt",2);
        System.out.println(minhalista.get(2));
        System.out.println(minhalista);
        minhalista.add("pilo",0);
        minhalista.add("tchaki",2);
        System.out.println(minhalista);
        minhalista.remove(0);
        System.out.println(minhalista);
        minhalista.remove(4);
        System.out.println(minhalista);
        minhalista.remove(2);
        System.out.println(minhalista);
    }

}
