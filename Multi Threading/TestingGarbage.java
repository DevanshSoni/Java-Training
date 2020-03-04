import java.util.Scanner;
class TestGarbage
{
	public void finalize()
	{
		System.out.println("System is garbage Collected");
	}
	public static void main(String[] args)
	{
		TestGarbage obj=new TestGarbage();
		TestGarbage obj1=new TestGarbage();
		obj=null;
		obj1=null;
		System.gc();
	}
}