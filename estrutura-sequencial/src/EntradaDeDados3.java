import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();// lê um número componto flutuante
		
		System.out.println("Você digitou: " + x);
		System.out.printf("Você digitou: %.2f%n " , x);
		
		sc.close();
	}

}
