import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();// lê um número inteiro
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}
