import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JIAB implements ActionListener{
	int a = 0;
	public static void main(String[] args) {
		JIAB github = new JIAB();
		github.hu();
	}
	void hu () {
		JFrame QWERTY = new JFrame();
		QWERTY.setVisible(true);
		JButton bat = new JButton();
		bat.setText("SURPRISE");	
		bat.addActionListener(this);
		QWERTY.add(bat);
		
		
	}
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 a++;
		 if (a==5) {
		showPicture("jackInTheBox.png");
		playSound("shiny-objects 1.wav");
		 }
	}
	private void playSound(String soundFile) { 
	     try {
	    	
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
