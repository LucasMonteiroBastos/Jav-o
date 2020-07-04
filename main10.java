import java.util.Locale;
import java.util.Scanner;

public class main10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int quantidade = 0;
		int soma = 0;
		
		while(x > 0) {
			soma = soma + x;
			quantidade = quantidade + 1;
			x = sc.nextInt();
		}
		
		if(quantidade > 0) {
			double resultado =  (double) soma / quantidade;
			System.out.printf("%.2f%n", resultado);
		}
		else {
			System.out.println("Impossivel calcular");
		}
		
		sc.close();
	}

}
