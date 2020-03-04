class TestingMethods extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Printing "+i);
		}
		try
		{
			System.out.println("I am Sleeping");
			Thread.sleep(3000);
		}catch(InterruptedException e)
		{
			System.out.println("Something Went Wrong");
		}
	}
}
class ThreadTesting
{
	public static void main(String[] args)
	{
		System.out.println("Number of Thread Running Hello"+Thread.activeCount());
		TestingMethods obj=new TestingMethods();
		TestingMethods obj1=new TestingMethods();
		System.out.println("Thread Name is "+obj.getName());
		System.out.println("Thread Name is "+obj1.getName());
		obj1.start();
		System.out.println("Number of Thread Running "+Thread.activeCount());
		obj.start();
		System.out.println("Number of Thread Running "+Thread.activeCount());
	}
}