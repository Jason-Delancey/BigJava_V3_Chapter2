import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class EllipseComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		/** Gets the width and height of the frame */
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0,0,getWidth(),getHeight());
		
		g2.setColor(Color.black);
		g2.draw(ellipse);
		g2.setColor(Color.blue);
		g2.fill(ellipse);
	}
}
