public class try_test 
{
	public static void main(String[] args) throws Exception
	{
		Thread.sleep(500);
		try
		{
			int a = 1;

			System.out.print(55/a);
		}
		catch(Exception e)
		{
			System.out.print(e);

		}
	}
}