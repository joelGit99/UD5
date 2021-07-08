
public class NumeroMayorApp {
	/**
	 * Programa que determina cu�l es el n�mero mayor, o si son iguales
	 * @author Joel
	 */
	public static void main(String[] args) {
		int n1 = 50;
		int n2 = 50;
		
		if(n1 ==  n2) {
			System.out.println("Ambos n�meros son iguales");
		} else if(Math.max(n1, n2) == n1) {
			System.out.println(n1 + " es el n�mero mayor");
		} else if(Math.max(n1, n2) == n2) {
			System.out.println(n2 + " es el n�mero mayor");
		} 
	}

}
