
public class main15 {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;

		int[] V = new int[7];
		int[] W = new int[7];

		for (int d = 1; d < b; d++) {
			V[d] = a;
			a = a * 2;
			W[d - 1] = a;
		}

		for (int d = 1; d < b; d++) {
			System.out.println(V[d]);
			System.out.println(W[d]);
		}
	}

}
