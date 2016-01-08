import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class TwoSquareComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle box = new Rectangle(0, 20, 50, 50);
		g2.setColor(Color.pink);
		g2.draw(box);
		g2.fill(box);
		box.translate(0, 50);
		g2.setColor(new Color(160, 32, 240));
		g2.draw(box);
		g2.fill(box);
	}
}

