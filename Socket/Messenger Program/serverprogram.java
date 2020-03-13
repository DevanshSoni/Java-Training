import java.io.*;
import java.net.*;
class serverprogram
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket s=new ServerSocket(10000);
            Socket soc=s.accept();
            DataInputStream dis=new DataInputStream(soc.getInputStream());
            DataOutputStream dos=new DataOutputStream(soc.getOutputStream());
            BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));  //Used to read Data from Console
            System.out.println("Start Writing the message");
            String input="",output="";
            while(!input.equalsIgnoreCase("stop"))
            {
                output=obj.readLine();
                dos.writeUTF(output);
                input=dis.readUTF();
                System.out.println("Client :- "+input);
                dos.flush();
            }
            dos.close();
            dis.close();
            soc.close();s.close();
        }
        catch(Exception e)
        {
            System.out.println("Something Went Wrong");
            System.out.println(e.getMessage());
        }
    }
}