import java.io.*;
import java.net.*;

class ServerFile
{
    public static void main(String[] args)
    {
        try{
        ServerSocket s=new ServerSocket(10000);
        Socket ref=s.accept();
        DataInputStream obj=new DataInputStream(ref.getInputStream());
        String content = (String)obj.readUTF();
        System.out.println("Message from client is "+content);
        s.close();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}