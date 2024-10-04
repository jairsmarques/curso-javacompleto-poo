import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);// lê um caractere(0 -> lê o primeiro caractere)
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}
