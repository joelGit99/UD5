import javax.swing.JOptionPane;

public class MensajeBienvenida2App {
	/**
	 * Programa que te da la bienvenida a través de Pop-up
	 * @author Joel
	 */
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
	}

}
