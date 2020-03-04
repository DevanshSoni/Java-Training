import java.io.*;
class TestAppend
{
	public static void main(String[] args)
	{
		byte []arr={65,66,67,68,69,70};
		FileOutputStream obj=null;
		try{
		obj=new FileOutputStream("hello.txt",true);
		obj.write(arr);
		}catch(Exception e)
		{
			System.out.println("Something Went Wrong While Opening The File");
		}
		finally
		{
			try{obj.close();}catch(Exception e){System.out.println("Error in File Closing");};
		}
	}
}