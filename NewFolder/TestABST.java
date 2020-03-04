abstract class TestAbst
{
	abstract void fun();
}

class Implementing extends TestAbst
{
	void fun()
	{
		System.out.println("Hello Have fun");
	}
}
class TestABST12
{
	public static void main(String[] args)
	{
		Implementing obj=new Implementing();
		obj.fun();
	}
}