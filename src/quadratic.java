import javax.swing.JOptionPane;

public class quadratic {

	public static void main(String[] args) {
		String inputa = JOptionPane.showInputDialog("Enter 'a'.");
		Double a = Double.parseDouble(inputa);
		String inputb = JOptionPane.showInputDialog("Enter 'b'.");
		Double b = Double.parseDouble(inputb);
		String inputc = JOptionPane.showInputDialog("Enter 'c'.");
		Double c = Double.parseDouble(inputc);
		quadratic(a, b, c);
	}
	//quadratic function
	public static void quadratic(double a, double b, double c) {
		if (Math.sqrt(Math.pow(b, 2) - (4 * a * c)) >= 0) {
			double root1 = ((b * -1) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			double root2 = ((b * -1) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			JOptionPane.showMessageDialog(null, "First root: " + root1 + "\nSecond root: " + root2);
		}else {
			JOptionPane.showMessageDialog(null, "There are no real solutions.");
		}
		
	}

}
