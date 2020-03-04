class A
{
	A()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	B()
	{
		super();
		System.out.println("Hii");
	}
	B(int a)
	{
		System.out.println("This is overloaded constructor");
	}
}
class C
{
	public static void main(String[] args)
	{
		B obj=new B();
	}
}