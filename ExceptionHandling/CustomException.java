class Custom extends Throwable
{
    Custom()
    {
        super();
    }
    Custom(String msg)
    {
        super(msg);
    }
    void callme()
    {
        System.out.println("Hello This is Call ME Method");
    }
}
class TestCustom
{
    static void testingcustom(int a) throws Custom
    {
        if(a==0)
        {
            throw new Custom("Bana Diya Custom Exception");
        }
        else
        {
            System.out.println("Bach Gye Exception se");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            testingcustom(0);
        }
        catch(Custom e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}