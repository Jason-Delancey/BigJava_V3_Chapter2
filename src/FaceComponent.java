import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
                        Draws a face.
 */
public class FaceComponent extends JComponent
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
		ellipse = new Ellipse2D.Double(getWidth() * 0.20,getHeight() * 0.25,getWidth() * 0.25,getHeight() * 0.25);
		g2.setColor(Color.black);
		g2.draw(ellipse);
		ellipse = new Ellipse2D.Double(getWidth() * 0.60,getHeight() * 0.25,getWidth() * 0.25,getHeight() * 0.25);
		g2.setColor(Color.black);
		g2.draw(ellipse);
		
		Line2D.Double line = new Line2D.Double(getWidth() * 0.20,getHeight() * 0.70,getWidth() * 0.85,getHeight() * 0.70);
		g2.setColor(Color.black);
		g2.draw(line);
	}
}
