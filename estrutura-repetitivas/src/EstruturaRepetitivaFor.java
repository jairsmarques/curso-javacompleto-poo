import java.util.Scanner;

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int aux = sc.nextInt();
			soma += aux;
		}
		System.out.println(soma);
		
		sc.close();
	}

}
