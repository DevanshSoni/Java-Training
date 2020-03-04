class DemoThread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        System.out.println("I am in the loop "+i+" Times");
    }
}
class TestingThread
{
    public static void main(String[] args)
    {
        DemoThread obj=new DemoThread();
        DemoThread obj2=new DemoThread();
        System.out.println(obj2.getName());
        obj.start();
        System.out.println(Thread.currentThread());
        try
        {
            obj.join();
        }
        catch(Exception e)
        {
            System.out.println("Something went Wrong");
        }
        System.out.println(Thread.currentThread());
        obj2.start();
    }
}