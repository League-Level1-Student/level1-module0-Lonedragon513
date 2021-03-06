/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String A = "https://www.google.com/logos/doodles/2018/alfonsina-stornis-126th-birthday-5165062418333696-2x.jpg";
		// 2. create a variable of type "Component" that will hold your image
                Component Image =createImage(A);

		// 3. use the "createImage()" method below to initialize your Component
        		
		// 4. add the image to the quiz window
                quizWindow.add(Image);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
               String BN = JOptionPane.showInputDialog("what is this");
		// 7. print "CORRECT" if the user gave the right answer
                if  (BN.equals("Alfonsina Storni’s 126th Birthday")) {
                	JOptionPane.showMessageDialog(null, "CORRECT");
                }
		// 8. print "INCORRECT" if the answer is wrong
                else {
                	JOptionPane.showMessageDialog(null, "INCORRECT");
                }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
                quizWindow.remove(Image);	
                // 10. find another image and create it (might take more than one line of code)
                Component HI =createImage("https://www.google.com/logos/doodles/2015/nepal-republic-day-2015-5723153296785408-hp2x.jpg");

		// 11. add the second image to the quiz window
                quizWindow.add(HI);
		// 12. pack the quiz window
                quizWindow.pack();
		// 13. ask another question
                String MI = JOptionPane.showInputDialog("what is this");
		// 14+ check answer, say if correct or incorrect, etc.
                if  (MI.equals("Nepal Republic Day 2015")) {
                	JOptionPane.showMessageDialog(null, "CORRECT");
                }
                else {
                	JOptionPane.showMessageDialog(null, "INCORRECT");
                }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





