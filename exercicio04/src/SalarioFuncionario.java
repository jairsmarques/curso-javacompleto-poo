import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número do funcionário: ");
		int numeroFuncionario = sc.nextInt();
		System.out.print("Digite as horas trabalhadas pelo funcionário: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor da hora trabalhada: ");
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n" , salario);
		
		
		sc.close();

	}

}
