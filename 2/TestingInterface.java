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
}
public class TestingInterface
{
	public static void main(String[] args)
	{
		CallBack obj=new ImplementingInterface();
		obj.callback();
		obj.hello();
	}
}