import java.io.*;

class TestingBytes
{
	public static void main(String[] args)
	{
		FileInputStream f=null;
		char arr[]={'A','B','C','D','E'};
		try{
			f=new FileInputStream("hello.txt");
			InputStreamReader b=new InputStreamReader(f);
			b.read(arr,0,5);
			//System.out.println("Value of a is "+a);
			for(char temp:arr)
			{
				System.out.println(temp);
			}
		}catch(Exception e)
		{
			System.out.println("Error in File Opening"+ e.getMessage());
		}
		finally
		{
			try
			{
				f.close();
			}
			catch(Exception e)
			{
				System.out.println("Error in Closing The File");
			}
		}
	}
}