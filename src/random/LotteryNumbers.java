package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		
		Random dom = new Random();
		int random1 = dom.nextInt(10);
		Random ran = new Random();
		int random2 = ran.nextInt(10);
		Random and = new Random();
		int random3 = and.nextInt(10);
		Random ndo = new Random();
		int random4 = ndo.nextInt(10);
		Random rm = new Random();
		int random5 = rm.nextInt(10);
		JOptionPane.showMessageDialog(null, "YOUR LOTTERY TICKET: " +random1+ +random2+ +random3+ +random4+ +random5);
		JOptionPane.showMessageDialog(null, "THE WINNER OF THIS LOTTERY IS THE OWNER OF THE TICKET " +random1+ +random2+ +random3+ +random4+ +random5);
	}
}
