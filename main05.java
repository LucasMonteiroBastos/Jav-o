import java.util.Locale;
import java.util.Scanner;

public class main05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double result = x + y;
		
		if(result < 60.00) {
			System.out.println("NOTA FINAL = " + result);
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("NOTA FINAL = " + result);
		}
		
		sc.close();
	}

}
