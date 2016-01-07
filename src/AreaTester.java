import java.awt.Rectangle;
/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class AreaTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Rectangle temp = new Rectangle(5, 10);
		double area = temp.getWidth() * temp.getHeight();
		System.out.println(area);
		
		System.out.println("Expected area: ");
		System.out.println(50);
	}

}
