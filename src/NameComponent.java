import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
 * Draws a name in red inside a blue rectangle.
 */
public class NameComponent extends JComponent
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		String name = "Jason Delancey";
		Rectangle box = new Rectangle(5, 10, 200, 100);
		g2.draw(box);
		g2.setColor(Color.BLUE);
		g2.fill(box);
		g2.setColor(Color.RED);
		g2.drawString(name, 30, 50);
	}
}
