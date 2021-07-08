
public class CienNumerosDivisibleApp {
	/**
	 * Programa que muestra hasta 100, los números divisibles entre 2 y 3
	 * @author Joel
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
