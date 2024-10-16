//Programa para ler dois valore inteiros
// e depois mostrar na tela a soma desses números com uma mensagem explicativa

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número inteiro: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int numero2 = sc.nextInt();

		int soma = numero1 + numero2;

		System.out.println("SOMA = " + soma);

		sc.close();

	}

}
