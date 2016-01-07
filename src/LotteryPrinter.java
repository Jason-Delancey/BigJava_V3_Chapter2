import java.util.Random;

/**
 * 
 */

/**
 * @author CloudStrife
 *
 */
public class LotteryPrinter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Random generator = new Random();
		System.out.println("Play this combination. It will make you rich!");
		for(int i = 0; i < 6; i++)
		{
			System.out.println(generator.nextInt(49) + 1);
		}
	}

}
