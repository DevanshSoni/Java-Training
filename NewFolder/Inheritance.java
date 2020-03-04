class Test
{
	Test()
	{
		System.out.println("Super Class 1");
	}
	void fun()
	{
		System.out.println("Hello");
	}
}
class Test2 extends Test
{
	Test2()
	{
		System.out.println("Super Class 2");
	}
	void fun()
	{
		System.out.println("Hello 22");
	}
}

class Testing
{
	public static void main(String[] args)
	{	
		Test obj;
		obj=new Test2();
		obj.fun();
	}
}