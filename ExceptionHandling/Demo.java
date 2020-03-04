import java.util.Scanner;
public class Demo
{
	static void m() throws Exception
	{
		m1();
	}
	static void m1() throws Exception
	{
		m2();
	}
	static void m2() throws Exception
	{
		throw new Exception("Haanji Ye Hi h Exception Propagation");
	}
	public static void main(String[] args)
	{
		try
		{
			m();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}