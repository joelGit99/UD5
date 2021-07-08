
public class NumeroMayorApp {
	/**
	 * Programa que determina cuál es el número mayor, o si son iguales
	 * @author Joel
	 */
	public static void main(String[] args) {
		int n1 = 50;
		int n2 = 50;
		
		if(n1 ==  n2) {
			System.out.println("Ambos números son iguales");
		} else if(Math.max(n1, n2) == n1) {
			System.out.println(n1 + " es el número mayor");
		} else if(Math.max(n1, n2) == n2) {
			System.out.println(n2 + " es el número mayor");
		} 
	}

}
