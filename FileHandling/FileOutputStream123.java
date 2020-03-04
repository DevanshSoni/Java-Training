import java.io.*;
class Demo implements Serializable // Serializable is a marker interface
{
	int a=10;
	int b=20;
}
class Demo12
{
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		try
		{	FileOutputStream o=new FileOutputStream("Object12");
			ObjectOutputStream a=new ObjectOutputStream(o);
			a.writeObject(obj);
			a.close();
			FileInputStream o1=new FileInputStream("Object12");
			ObjectInputStream r=new ObjectInputStream(o1);
	
			Demo obj12=(Demo)r.readObject();
			System.out.println(obj12.a);
			System.out.println(obj12.b);
			o1.close();
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}