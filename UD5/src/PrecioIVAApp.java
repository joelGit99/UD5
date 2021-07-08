import javax.swing.JOptionPane;

public class PrecioIVAApp {
	/**
	 * Programa que calcula el precio con IVA
	 * @author Joel
	 */
	public static void main(String[] args) {
		String precio = JOptionPane.showInputDialog("Introduce el precio del producto");
		double precio2 = Double.parseDouble(precio);
		final double IVA = 0.21;
		double precioFinal = precio2 + (precio2 * IVA);
		
		JOptionPane.showMessageDialog(null, "El precio final es  " + precioFinal);
	}

}
