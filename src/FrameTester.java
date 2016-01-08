import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class FrameTester
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		JTextField text = new JTextField ("Hello, Jason!");
		text.setBackground(new Color(152, 251, 152));
		frame.add(text);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	} 
	
}