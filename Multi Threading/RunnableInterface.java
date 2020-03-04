class TestingInterface implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("This is in the loop "+i+" Times");
        }
    }
}
class AnotherClass extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("This is in the loop of AnotherClass "+i);
        }
    }
}
class MainClassofInterface
{
    public static void main(String[] args)
    {
        TestingInterface obj=new TestingInterface();
        Thread t1=new Thread(obj);
        t1.setPriority(5);
        t1.start();
        AnotherClass j=new AnotherClass();
        j.setPriority(10);
        j.start();
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
    }
}