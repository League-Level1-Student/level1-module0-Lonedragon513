import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houaew {
	static Robot Bb = new Robot();

	public static void main(String[] args) {
		Bb.setPenWidth(10);
		Bb.moveTo(10, 500);
		Bb.miniaturize();
		Bb.penDown();
		Bb.setSpeed(150);
		JOptionPane.showMessageDialog(null,
				"hi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi hhi hi  hi hi  hii hi h");

		for (int i = 0; i < 8; i++) {

			String aa = JOptionPane.showInputDialog("number");
			int a = Integer.parseInt(aa);
			String bb = JOptionPane.showInputDialog("number");
			int b = Integer.parseInt(bb);
			String cc = JOptionPane.showInputDialog("number");
			int c = Integer.parseInt(cc);

			int hight = 0;
			String hihi = JOptionPane.showInputDialog("what hignt  ( s = small; m = medium; l= large");
			if (hihi.equals("s")) {
				hight = 60;
			} else if (hihi.equals("m")) {
				hight = 120;
			} else {
				hight = 250;
			}
			HHouse(hight, a, b, c);
		}
	}

	static void HHouse(int x, int a, int b, int c) {
		String peek = JOptionPane.showInputDialog("peek roof?? (Y or N)");
		Bb.setPenColor(a, b, c);
		Bb.move(x);
		if (peek.equals("Y")) {
			roof();
		} else {
			Bb.turn(90);
			Bb.move(20);
			Bb.turn(90);
		}
		Bb.move(x);
		Bb.turn(-90);
		Bb.setPenColor(0, 150, 0);
		Bb.move(20);
		Bb.turn(-90);
	}

	static void roof() {
		Bb.turn(45);
		Bb.move(20);
		Bb.turn(90);
		Bb.move(20);
		Bb.turn(45);
	}
}
