import java.io.*;
class TestFile
{
	public static void main(String[] args)
	{	
		try
		{
			int data=0;
			String content="";
			FileInputStream in=new FileInputStream("input.txt");
			FileOutputStream out=new FileOutputStream("output.txt");
			while((data=in.read())!=-1)
			{
				content=content+(char)data;
			}
			in.close();
			System.out.println(content);
			byte[] arr=content.getBytes();
			out.write(arr);
			out.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}