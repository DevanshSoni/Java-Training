class TestThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Is Started");
        try
        {
            Thread.sleep(500);
        }catch(InterruptedException e)
        {
            System.out.println("Something went Wrong");
        }
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}

class MyThread
{
    public static void main(String[] args)
    {
        TestThread obj=new TestThread();
        TestThread obj2=new TestThread();
        obj.start();
        obj2.start();
    }
}