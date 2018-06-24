import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuTV implements MouseListener {
	JButton JB1 = new JButton();
	JButton JB2 = new JButton();
	JButton JB3 = new JButton();

	public static void main(String[] args) {
		CuTV me = new CuTV();
		me.helpMe();
	}

	void helpMe() {
		JFrame JF = new JFrame();
		JF.setVisible(true);
		JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel JP = new JPanel();
		JF.add(JP);

		JB1.setText("Duck");

		JB2.setText("Frog");

		JB3.setText("Fluffy House");
		JP.add(JB1);
		JB1.addMouseListener(this);
		JP.add(JB2);
		JB2.addMouseListener(this);
		JP.add(JB3);
		JB3.addMouseListener(this);
		JF.pack();
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		JButton BP = (JButton) e.getSource();
		if (BP.equals(JB1)) {
			showDucks();
		} else if (BP.equals(JB2)) {
			showFrog();
		} else if (BP.equals(JB3)) {
			showFluffyUnicorns();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		// HI
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
