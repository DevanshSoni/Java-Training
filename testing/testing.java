interface A
{
	void fun();
}
interface C
{
	void fun();
}
interface B extends A,C
{
	void fun();
}
class Demo2
{
	void fun()
	{
		System.out.println("This is Fun of Demo2");
	}
}
class Demo extends Demo2 implements B,A
{
	public void fun()
	{
		System.out.println("Hello");
	}
}
class Testing
{
	public static void main(String[] args)
	{
		Demo o=new Demo();
		o.fun();
	}
}