import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String wow = JOptionPane.showInputDialog("What do you like?");
		JOptionPane.showMessageDialog(null, "Okay... I'm supposed to say that " + wow + " is awesome.");
	}
}
