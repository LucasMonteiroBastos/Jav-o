import java.util.Locale;
import java.util.Scanner;

public class main07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutosConsumidos = sc.nextInt();
		
		double valorCobrado = 50.0;
		
		if(minutosConsumidos > 100) {
			valorCobrado += (minutosConsumidos - 100) * 2.0;
		}
		
		System.out.printf("O valor a ser cobrado é: %.2f%n", valorCobrado);
		
		sc.close();
	}

}
