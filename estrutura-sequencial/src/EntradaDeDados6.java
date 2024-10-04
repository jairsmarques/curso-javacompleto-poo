import java.util.Scanner;

public class EntradaDeDados6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// quebra de linha pendente
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();//adicionar um nextLine vazio para consumir quebra de linha pendente
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
