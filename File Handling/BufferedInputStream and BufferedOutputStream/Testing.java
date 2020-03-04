import java.io.*;
class Testing
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream obj1=new FileOutputStream("testing_buffer.txt");
            BufferedOutputStream obj=new BufferedOutputStream(obj1);
            String name="Devansh";
            byte arr[]=name.getBytes();
            obj.write(arr);
            obj.flush();
            obj1.flush();
            obj.close();
            obj1.close();
            System.out.println("Data Written Sucessfully");
        }catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}