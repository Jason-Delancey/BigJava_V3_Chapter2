import java.awt.Rectangle;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class IntersectionPrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle box1 = new Rectangle(5, 10, 20, 30);
		Rectangle box2 = new Rectangle(10, 20, 20, 30);
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box1.intersection(box2));
		
		/** The intersection on two rectangles, if they do not intersect, will have 
		 * 0 width and 0 height.
		 */
		box2.translate(15, 20);
		System.out.println(box1.intersection(box2));
	}

}
