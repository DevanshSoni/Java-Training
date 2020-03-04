class Demo12
{
	protected int a=10;
	static void callme()
	{
		System.out.println("Called");
	}
	static void fun()
	{	callme();
		//System.out.println(a);
		System.out.println("Hello Buddy this is a normal method");
	}
}

class TestClass
{
	public static void main(String[] args)
	{
		Demo12 obj=new Demo12();
		Demo12.fun();
		System.out.println(obj.a);
	}
}