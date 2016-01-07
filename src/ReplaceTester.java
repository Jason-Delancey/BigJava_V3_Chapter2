/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class ReplaceTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String temp = "Mississippi";
		temp = temp.replace("i", "!");
		temp = temp.replace("s", "$");
		System.out.println(temp);
		System.out.println("Expected Result:");
		System.out.println("M!$$!$$!pp!");
	}

}
