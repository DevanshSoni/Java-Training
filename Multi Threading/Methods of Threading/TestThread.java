class ThreadMethods extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Printing "+i);
		}
	}
}
class TestThread
{
	public static void main(String[] args)
	{
		ThreadMethods t1=new ThreadMethods();
		t1.setPriority(10);
		ThreadMethods t2=new ThreadMethods();
		t1.start();
		t2.start();
		t1.setDaemon(true);
		t1.setName("This is my Thread");
		try{t1.join();}catch(Exception e){System.out.println("Exception Goes Here ");}
		t2.stop();
		System.out.println("This thread is in Condition "+t2.getState());
		System.out.println("T1 Thread is Daemon or not ?  "+t1.isDaemon());
		System.out.println("Thread Name is "+t1.getName());
		System.out.println("Thread has the priority "+t1.getPriority());
		System.out.println("Maximum Thread has the priority "+Thread.MAX_PRIORITY);
		System.out.println("Minimum Thread has the priority "+Thread.MIN_PRIORITY);
		System.out.println("Thread has the priority "+Thread.NORM_PRIORITY);	
		System.out.println("This thread is in Condition "+t1.getState());
		System.out.println("Currently Active Thread are "+Thread.activeCount());	
	}
}