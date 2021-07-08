import javax.swing.JOptionPane;

public class ContrseñaApp {

	public static void main(String[] args) {
		String contraseña = "hugopatatas";
		int i = 0;
		String contraInput = JOptionPane.showInputDialog("Introduce la contraseña");
		if(contraInput.equals(contraseña)) {
			JOptionPane.showMessageDialog(null, "Enhorabuena!");
		} else {
			i++;
			while(contraInput != contraseña && i < 3) {
				if(contraInput.equals(contraseña)) {
					JOptionPane.showMessageDialog(null, "Enhorabuena!");
				} else {
					contraInput = JOptionPane.showInputDialog("Introduce la contraseña");
					i++;
				}
			}
		}
	}
}

