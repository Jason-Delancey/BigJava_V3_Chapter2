import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
/**
 * Shows a frame with the standard color names.
 */
public class ColorNameViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("ColorNameViewer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorNameComponent component = new ColorNameComponent();
		frame.add(component);
		frame.setVisible(true);
	}
}

