abstract class A
{
	abstract void callback();
}
class Testing2
{
	public static void main(String[] args)
	{
		A obj=new A()
		{
			void callback()
			{
				System.out.println("Hello this is callback");
			}
		};
		obj.callback();
	}
}