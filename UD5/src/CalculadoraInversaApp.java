import javax.swing.JOptionPane;

public class CalculadoraInversaApp {

	public static void main(String[] args) {
		String numero1 = JOptionPane.showInputDialog("Introduce el primer número");
		String numero2 = JOptionPane.showInputDialog("Introduce el segundo número");
		String signo = JOptionPane.showInputDialog("Introduce el signo");
		int num1 = Integer.parseInt(numero1);
		int num2 = Integer.parseInt(numero2);
		
		switch(signo) {
		case "+":
			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
		break;
		case "-":
			JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
		break;
		case "*":
			JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2));
		break;
		case "/":
			JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + ((double)num1 / num2));
		break;
		case "^":
			JOptionPane.showMessageDialog(null, num1 + " elevado a " + num2 + " = " + (Math.pow(num1, num2)));
		break;
		case "%":
			JOptionPane.showMessageDialog(null, num1 + " % " + num2 + " = " + (num1 % num2));
		break;
		}
	}

}
