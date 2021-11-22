package pilha;

public class TestePilha {
	public static void main(String[] args) {

		Pilha<Integer> minhapilha = new Pilha<>();

		minhapilha.push(10);
		minhapilha.push(20);
		minhapilha.push(30);
		minhapilha.push(40);
		minhapilha.push(50);
		minhapilha.push(60);

		System.out.println(minhapilha);

		minhapilha.pop();

		System.out.println(minhapilha);

		System.out.println(minhapilha.top());

		System.out.println(minhapilha);
		
		System.out.println(minhapilha.size());

	}
}