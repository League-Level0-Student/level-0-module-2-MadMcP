package methods;

import javax.swing.JOptionPane;

public class RollerCoaster {
	
 public static void main(String[] args) {
	
	 String height;
	 height=JOptionPane.showInputDialog("How tall are you in inches?");
	 int h=Integer.parseInt(height);
	 int g= 48-h;
	 if (h>48) {
		 JOptionPane.showMessageDialog(null, "You may go on the rollercoaster.");
	 }
	 else {
		 JOptionPane.showMessageDialog(null, "Come back once you've grown " +g+ " more inches");
	 }
}
}
