// programa para ler o valor do raio de um círculo,  e depois mostrar
// o valor da área deste círculo com 4 casas decimais

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI = 3.14159;
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double area = PI * raio * raio;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
