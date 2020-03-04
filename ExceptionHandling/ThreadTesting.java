class TestingMethods extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Printing "+i);
		}
	}
}
class ThreadTesting
{
	public static void main(String[] args)
	{
		TestingMethods obj=new TestingMethods();
		obj.start();
	}
}