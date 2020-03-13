import java.io.*;
import java.net.*;
import java.util.Scanner;

class ClientProgram
{
        public static void main(String[] args)
        {
                Scanner obj=new Scanner(System.in);
                try{
                Socket s=new Socket("localhost",10000);
                DataOutputStream dos=new DataOutputStream(s.getOutputStream());
                String message=obj.nextLine();
                dos.writeUTF(message);
                dos.flush();
                dos.close();
                }catch(Exception e)
                {
                    System.out.println("Something Went Wrong");
                    System.out.println(e.getMessage());
                }
        }
}
