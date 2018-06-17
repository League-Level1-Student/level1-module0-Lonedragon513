import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sound implements ActionListener{
	JButton a = new JButton();
	JButton ab = new JButton();
	JButton abc = new JButton();
public static void main(String[] args) {
	sound hihi = new sound();
	hihi.sadness();
	
	
}
void sadness() {
	JFrame main = new JFrame(); 
	main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	main.setVisible(true);
	JPanel hie = new JPanel();
	main.add(hie);
	hie.add(a);
	hie.add(ab);
	hie.add(abc);
	main.pack();
	a.addActionListener(this);
	ab.addActionListener(this);
	abc.addActionListener(this);
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton BP = (JButton) e.getSource();
	if (BP.equals(a)) {
		playSound("cymbal2.wav");
	}
	else if (BP.equals(ab)) {
		playSound("homer-woohoo2.wav");
	}
	else if (BP.equals(abc)) {
		playSound("shiny-objects 2.wav");
}
}


}
