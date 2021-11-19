package fila;

public class Testefila {
	public static void main(String[] args) {
		
		
		Fila<String> minhafila = new Fila<>();
		
		
		minhafila.enqueue("thyago");
		minhafila.enqueue("joão");
		
		System.out.println(minhafila);
		
		
	}
}
