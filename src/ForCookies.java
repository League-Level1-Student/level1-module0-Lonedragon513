import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ForCookies implements ActionListener{

	public static void main(String[] args) {
		ForCookies fc = new ForCookies();
	fc.showButton();
	}
	public void showButton() {
		
		JFrame hi = new JFrame ();
		hi.setVisible(true);
	     System.out.println("Button clicked");
	     JButton bat = new JButton();
	     hi.add(bat);
	     hi.pack();
	     hi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     bat.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "WooHoo");
		int rand = new Random().nextInt(5);
		
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You cannot love life until you live the life you love.");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null,"I have a dream....Time to go to bed..");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "A pleasant expeience is ahead:don't pass it by.");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "Love take practice.");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, " You will soon discover a major truth about the one you love most.");
		}
	}
	
	
}
