import javax.swing.JOptionPane;

public class DivisibleApp {
	/**
	 * Programa que comprueba si el número introducido, es divisible entre 2
	 * @author Joel
	 */
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce un número");
		int num2 = Integer.parseInt(numero);
		
		if(num2 % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, "No es divisible entre 2");
		}
	}

}
