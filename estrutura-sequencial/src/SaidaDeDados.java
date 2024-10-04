import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		System.out.print("Olá mundo!");// saida sem quebra de linha
		System.out.println("Bom dia!");// saida com quebra de linha
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);// formata as casas decimais
		System.out.printf("%.4f%n", x);// formata as casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("------------------------------------");
		System.out.println("Concatenar usando println");
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.println("------------------------------------");
		System.out.println("Concatenar usando printf");
		System.out.printf("RESULTADO = %.2f METROS%n" , x);
		System.out.println("------------------------------------");
		System.out.println("Concatenar vários elementos");
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
