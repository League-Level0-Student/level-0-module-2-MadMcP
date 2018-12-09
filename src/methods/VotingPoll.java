package methods;

import javax.swing.JOptionPane;

public class VotingPoll {

	public static void main(String[] args) {
		
		String age;
		age=JOptionPane.showInputDialog("How old are you?");
		int a = Integer.parseUnsignedInt(age);
		if(a>17) {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think. Stop wasting our time.");
		}
	}
}
