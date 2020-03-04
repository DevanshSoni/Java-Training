class Demo
{
	void fun()	
	{
		System.out.println("Hello from Demo Fun");
	}
	static void fun3()
	{
		System.out.println("This is Static method");
	}
}
class Demo2 extends Demo
{
	public void fun()
	{
		System.out.println("Child Class Fun Method");
	}
	static void fun3()
	{
		System.out.println("This is Static method in Subclass");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		obj.fun();
		Demo2 obj2=new Demo2();
		obj2.fun();
		Demo obj3=new Demo2();
		obj3.fun3();
		Demo2 obj22=new Demo2();
		Demo2.fun3();
	}
}