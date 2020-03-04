class MakeMember
{
	int rno;
	int id;
	String name;
	void makeithappen(int a,int b,String n)
	{
		rno=a;id=b;name=n;
	}
	void makeithappen(int a,String n,int b)
	{
		System.out.println("Roll NO is "+rno);
		System.out.println("ID is "+id);
		System.out.println("Name is "+name);
	}
}

class TestingJava
{
	public static void main(String[] args)
	{
		MakeMember obj=new MakeMember();
		obj.makeithappen(12,12,"Devansh");
		obj.makeithappen(12,"Devansh",12);
		//obj.display();
	}
}