import javax.swing.JOptionPane;

public class Contrse�aApp {

	public static void main(String[] args) {
		String contrase�a = "hugopatatas";
		int i = 0;
		String contraInput = JOptionPane.showInputDialog("Introduce la contrase�a");
		if(contraInput.equals(contrase�a)) {
			JOptionPane.showMessageDialog(null, "Enhorabuena!");
		} else {
			i++;
			while(contraInput != contrase�a && i < 3) {
				if(contraInput.equals(contrase�a)) {
					JOptionPane.showMessageDialog(null, "Enhorabuena!");
				} else {
					contraInput = JOptionPane.showInputDialog("Introduce la contrase�a");
					i++;
				}
			}
		}
	}
}

