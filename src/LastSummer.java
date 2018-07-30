import javax.swing.JOptionPane;

public class LastSummer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hey, " + name + "! I know that you went to MathPath last summer!");
	}
}
