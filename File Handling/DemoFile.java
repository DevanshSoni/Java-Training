import java.io.*;
class DemoFile
{
	public static void main(String[] args)
	{	
		int a;
		FileInputStream obj=null;
		try
		{
		obj=new FileInputStream("hello.txt");
		do
		{
			a=obj.read();
			System.out.println(a);
			if(a!=-1)
			System.out.print((char)a);
		}while(a!=-1);
		}catch(Exception e)
		{
			System.out.println("error in opening file");
		}
		finally
		{
			try{obj.close();}catch(Exception e){System.out.println("Error in Closing File");}		
		}
	}
}