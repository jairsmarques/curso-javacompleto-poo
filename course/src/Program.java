/* 
 * Programa para ler um búmero inteiro N e a altura de N pessoas.
 * Armazene as N alturas em um vetor.
 * Em seguida, mostrar a altura média dessas pessoas.
*/

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n]; // cria um vetor de N posições
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble(); // armazena o valor digitado pelo usuário na posição do vetor
		}
		
		double sum = 0;// variável para acumular o valor da soma
		for (int i = 0; i < n; i++) {
			sum += vect[i];// percorre o vetor e acumula a soma dos valores na variável sum
		}
		double avg = sum / n; // calcula a média da soma 
		
		System.out.printf("AVERAGE HEIGHT: %.2f " , avg);
		
		sc.close();
	}

}
