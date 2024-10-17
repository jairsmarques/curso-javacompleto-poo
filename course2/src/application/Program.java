/*
 * Programa para ler um número inteiro N e os dados(nome e preço) de N produtos.
 * Armazene N produtos em um vetor.
 * Em seguida, mostrar o preço médio dos produtos.
 */
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n]; // cria um vetor de N produtos
		
		for (int i = 0; i < vect.length; i++) {// for para percorrer o vetor 
			sc.nextLine();// nextLine vazio 
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);// instancia um novo produto
		}
		
		double sum = 0.0;// variável para armazenar o valor da soma
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();// acessa o vetor na posição i e pego somente o valor do preço.
		}
		double avg = sum / vect.length;// calcula a média
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
