interface ConstantInterface
{
	int a=10;
	int b=20;
	int c=30;
}
class TestingConstant implements ConstantInterface
{
	int a;
	void changeValue()
	{
		a=80;
		System.out.println(" A is "+ConstantInterface.a);
	}
}
class TestConstant
{
	public static void main(String[] args)
	{
		TestingConstant obj=new TestingConstant();
		obj.changeValue();
	}
}