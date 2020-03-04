import java.util.*;
class LinkedListProgram
{
	public static void main(String[] args)
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("Devansh");
		l.add("Manoj");
		l.add("Swati");
		l.add("Ayush");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}