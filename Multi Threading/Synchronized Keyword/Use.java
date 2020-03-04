class ThreadSynchronized
{
	synchronized void fun()	
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Printing "+i);
		}
	}
}
class Testing extends Thread
{
	ThreadSynchronized t;
	Testing(ThreadSynchronized t)
	{
		this.t=t;
	}
	public void run()
	{
		t.fun();
	}
}
class Another extends Thread
{
	ThreadSynchronized t;
	Another(ThreadSynchronized t)
	{
		this.t=t;
	}
	public void run()
	{
		t.fun();
	}	
}
class TestThread
{
	public static void main(String[] args)
	{
		ThreadSynchronized obj=new ThreadSynchronized();
		Testing t1=new Testing(obj);
		Another t2=new Another(obj);
		t1.start();
		t2.start();
	}
}