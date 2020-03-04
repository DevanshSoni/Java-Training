import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Devansh");
		a.add("Harshit");
		a.add("Ayush");
		a.add("Jatin");
		System.out.println(a.size());
		System.out.println(a.get(0));
		System.out.println(a.remove(0));
		System.out.println(a.get(0));
		System.out.println(a);
		Object[] arr=a.toArray();
		for(Object name:arr)
		{
			System.out.println(name);
		}
	}
}