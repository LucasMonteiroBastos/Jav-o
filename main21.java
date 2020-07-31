import java.util.Scanner;

public class main21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		for(int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println();
		
		int quantidadeDePares = 0;
		for(int i=0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				quantidadeDePares++;
			}
		}
		
		System.out.println(quantidadeDePares);
		sc.close();
	}

}
