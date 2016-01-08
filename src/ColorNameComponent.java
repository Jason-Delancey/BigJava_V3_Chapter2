import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class ColorNameComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.drawString("black", 0, 15);
		g2.setColor(Color.BLUE);
		g2.drawString("blue", 0, 30);
		g2.setColor(Color.cyan);
		g2.drawString("cyan", 0, 45);
		g2.setColor(Color.gray);
		g2.drawString("gray", 0, 60);
		g2.setColor(Color.darkGray);
		g2.drawString("dark gray", 0, 75);
		g2.setColor(Color.lightGray);
		g2.drawString("light gray", 0, 90);
		g2.setColor(Color.green);
		g2.drawString("green", 0, 105);
		g2.setColor(Color.magenta);
		g2.drawString("magenta", 0, 120);
		g2.setColor(Color.orange);
		g2.drawString("orange", 0, 135);
		g2.setColor(Color.pink);
		g2.drawString("pink", 0, 150);
		g2.setColor(Color.red);
		g2.drawString("red", 0, 165);
		g2.setColor(Color.yellow);
		g2.drawString("yellow", 0, 180);
	}
}
