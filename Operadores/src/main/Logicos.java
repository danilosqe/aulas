package main;

public class Logicos {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 0;

		if (n1 == n2 || n1 == n3) {
			System.out.println("n1 é igual a n2 OU n1 é igual a n3, valor de n1 = " + n1 + ", valor de n2 = " + n2
					+ ", valor de n3 = " + n3);
			System.out.println(true);
		}else {
			System.out.println(false);
		}

		if (n1 == n3 && n1 != n2) {
			System.out.println("n1 é igual a n3 e n1 é diferente e n3");
		} else {
			System.out.println(false);
		}

	}

}
