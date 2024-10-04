import java.util.Scanner;

public class EntradaDeDados1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();// lê uma palavra
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}
