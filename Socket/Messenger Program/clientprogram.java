import java.io.*;
import java.net.*;
class clientprogram
{
    public static void main(String[] args)
    {
        try
        {
            Socket s=new Socket("localhost",10000);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
            String input="",output="";
            while(!input.equalsIgnoreCase("stop"))
            {
                input=dis.readUTF();
                System.out.println("Server :- "+input);
                output=obj.readLine();
                dos.writeUTF(output);
                dos.flush();
            }
            dos.close();
            dis.close();
            s.close();
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong");
            System.out.println(e.getMessage());
        }
    }
}