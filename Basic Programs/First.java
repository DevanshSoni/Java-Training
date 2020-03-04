import java.util.Scanner;
class Demo2
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String f=obj.nextLine();
		String l=obj.nextLine();
		int a=obj.nextInt();
		String first=obj.nextLine();
		int b=obj.nextInt();
		int c=a+b;
		System.out.println("Addition is "+(a+b));
	}
}