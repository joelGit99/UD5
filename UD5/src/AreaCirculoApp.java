import javax.swing.JOptionPane;

public class AreaCirculoApp {
	/**
	 * Programa que calcula el �rea de un c�rculo
	 * @author Joel
	 */
	public static void main(String[] args) {
		String radio = JOptionPane.showInputDialog("Introduce el radio del c�rculo");
		double radio2 = Double.parseDouble(radio);
		final double PI = Math.PI;
		double area = PI * Math.pow(radio2,2);
		
		JOptionPane.showMessageDialog(null, "El �rea del c�rculo es " + area);
	}

}
