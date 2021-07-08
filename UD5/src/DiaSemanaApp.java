import javax.swing.JOptionPane;

public class DiaSemanaApp {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana");
		
		switch (dia) {
		case "Lunes":
			JOptionPane.showMessageDialog(null, "Dia laboral");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, "Dia laboral");
			break;
		case "Miércoles":
			JOptionPane.showMessageDialog(null, "Dia laboral");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, "Dia laboral");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Dia laboral");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Dia no laboral");
		}
	}

}
