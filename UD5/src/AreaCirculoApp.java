import javax.swing.JOptionPane;

public class AreaCirculoApp {
	/**
	 * Programa que calcula el área de un círculo
	 * @author Joel
	 */
	public static void main(String[] args) {
		String radio = JOptionPane.showInputDialog("Introduce el radio del círculo");
		double radio2 = Double.parseDouble(radio);
		final double PI = Math.PI;
		double area = PI * Math.pow(radio2,2);
		
		JOptionPane.showMessageDialog(null, "El área del círculo es " + area);
	}

}
