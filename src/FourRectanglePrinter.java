import java.awt.Rectangle;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class FourRectanglePrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle box = new Rectangle(10, 10, 30, 50);
		System.out.println(box);
		box.translate(30, 0);
		System.out.println(box);
		box.translate(-30, 50);
		System.out.println(box);
		box.translate(30, 0);
		System.out.println(box);
	}

}
