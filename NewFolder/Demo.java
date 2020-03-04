class Program2
{
    int a,b;
    private Program2()
    {
        a=0;
        b=0;
    }
    private Program2(Program2 obj)
    {
        a=obj.a;
        b=obj.b;
    }
    private Program2(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class Program
{
	public static void main(String[] args) {
		//Program2 a=new Program2();
		Program2 b=new Program2(19,20);
		//Program2 c=new Program2();
		b.display();
	}
}