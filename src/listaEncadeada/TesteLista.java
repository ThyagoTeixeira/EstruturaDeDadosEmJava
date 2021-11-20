package listaEncadeada;

public class TesteLista {
	public static void main(String[] args) {
		
		Lista<String> minhalista = new Lista<>();
		
		minhalista.push("thyago");
		minhalista.push("letinho");
		minhalista.push("anderson");
		
		System.out.println(minhalista.size());
		minhalista.add("yanni", 2);
		System.out.println(minhalista);
		minhalista.push("bruno");
		System.out.println(minhalista);
		minhalista.remove(2);
		System.out.println(minhalista);
	}
}
