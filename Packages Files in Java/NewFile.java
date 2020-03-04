import FirstPack.TestPackage;


class Demo12212 extends TestPackage
{
    public void fun()
    {
        System.out.println("Override in Demo12212");
    }
}
class Demo122
{
    public static void main(String[] args)
    {
        TestPackage obj=new TestPackage();
        Demo12212 obj12=new Demo12212();
        obj12.fun();
    }
}