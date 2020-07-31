import java.util.Locale;
import java.util.Scanner;

public class main18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i=0; i<n; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}
				
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += altura[i];
		}
		
		double media = soma / n;
		System.out.printf("Altura media: %.2f%n", media);
		
		int cont = 0;
		for (int i=0; i<n; i++) {
			if(idade[i] < 16) {
				cont += 1;
			}
		}
		
		 double x = cont * 100.0 / n;
		 System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);
		
		
		sc.close();
	}

}
