import java.awt.Rectangle;
/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class PerimeterTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle temp = new Rectangle(5, 10);
		double perimeter = (2 * temp.getWidth()) + (2 * temp.getHeight());
		System.out.println(perimeter);
		
		System.out.println("Expected perimeter: ");
		System.out.println(30);
	}

}
