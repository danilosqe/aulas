package main;

public class Relacionais {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1;
		
		if(n1 > n2) {
			System.out.println("n1 é maior que n2");
			System.out.println("value de n1: " + n1 + ", valor de n2 " + n2);
			
		}
		
		if(n1 < n2) {
			System.out.println("n2 é maior que n1");
			System.out.println("value de n1: " + n1 + ", valor de n2 " + n2);
		}
		
		if( n1 >= n2) {
			System.out.println("n1 é maior ou igual a n2");
			System.out.println("value de n1: " + n1 + ", valor de n2 " + n2);
		}
		
		if ( n1 <= n2) {
			System.out.println("n2 é maior ou igual a n1");
			System.out.println("value de n1: " + n1 + ", valor de n2 " + n2);
		}
	}

}
