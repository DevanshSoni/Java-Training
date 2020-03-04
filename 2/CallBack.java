public interface CallBack
{
	int callback();
	void hello();
}
class ImplementingInterface implements CallBack
{
	public int callback()
	{
		System.out.println("This is CallBack method of interface");
		return 1;
	}
	public void hello()
	{
		System.out.println("Hello Method of Interface");
	}
	interface NestedInterface
	{
		void NestedMethod();
		int CheckThisAlso();
	}
}
class NestedInterfaceImplementation implements ImplementingInterface.NestedInterface
{
	public void NestedMethod()
	{
		System.out.println("This is Interface as a member of a class Method");
	}
	public int CheckThisAlso()
	{
		System.out.println("This is CheckThisAls Method of Member Interface");
		return 12;
	}
}
class TestingInterface
{
	public static void main(String[] args)
	{
		CallBack obj=new ImplementingInterface();
		obj.callback();
		obj.hello();

		ImplementingInterface.NestedInterface obj12=new NestedInterfaceImplementation();
		obj12.NestedMethod();
		obj12.CheckThisAlso();
	}
}