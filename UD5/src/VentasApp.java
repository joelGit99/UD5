import javax.swing.JOptionPane;

public class VentasApp {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Introduce un número de ventas");
		int numVentas = Integer.parseInt(num);
		int ventas = 0;
		for (int i = 0; i < numVentas; i++) {
			String venta = JOptionPane.showInputDialog("Introduce un número de ventas");
			int ventaInt = Integer.parseInt(venta);
			ventas = ventaInt + ventas;
		}
		
		JOptionPane.showMessageDialog(null,"La suma de todas las ventas es " + ventas);
	}

}
