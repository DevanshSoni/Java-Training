import java.io.*;
class Hello implements Serializable
{
	public int a=10;
	public int b=20;
}

class WriteObject
{
	public static void main(String[] args)
	{
		Hello obj=new Hello();
		String name="Hello This is devansh here";
		byte []arr=name.getBytes();
		System.out.println(arr.length);
		try{
		FileOutputStream f1=new FileOutputStream("myfile.txt");
		f1.write(arr);
		f1.close();
		System.out.println("Sucessfully Write into the File");
		FileOutputStream f=new FileOutputStream("object.txt");
		ObjectOutputStream write=new ObjectOutputStream(f);
		write.writeObject(obj);
		f.close();
		write.flush();
		write.close();
		FileInputStream a=new FileInputStream("object.txt");
		ObjectInputStream read=new ObjectInputStream(a);
		Hello readobj=(Hello)read.readObject();   // Type Casting is performing because we are reading data in the form of bytes
		System.out.println(readobj.a);
		System.out.println(readobj.b);
		}catch(Exception e)
		{
			System.out.println("I am in Exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}