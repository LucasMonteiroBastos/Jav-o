import java.util.Locale;
import java.util.Scanner;

public class main17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt(); // criando a variavel N 
		double [] vet = new double [N]; // criando o vetor do tipo double e do tamanho de N
		
		for(int i=0; i<N; i++) { // preenchendo o vetor 
			vet[i] = sc.nextDouble(); // cade i recebe um valor dentro do vetor
		}
		for(int i=0; i<N; i++) { // printando cade elemento do vetor
			System.out.print(vet[i] + " "); // fazendo o espaçamento entre os elementos 
		}
		System.out.println(); // quebra de linha 
		
		double soma = 0.0; // variavel soma
		for(int i=0; i<N; i++) { 
			soma = soma + vet[i]; // variavel soma recebendo todos os valores contidos no vetor
		}
		
		System.out.printf("%.2f%n", soma); // imprimindo a soma dos elementos do vetor
		
		double media = soma / N; // media recebendo o valor total dos elementos, e dividindo por N quantidade
		System.out.printf("%.2f%n", media); // imprimindo a media dos elementos contidos no vetor.


		sc.close();
	}

}
