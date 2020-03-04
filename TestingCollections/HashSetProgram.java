import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		HashSet<Integer> obj=new HashSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		System.out.println(obj);
		System.out.println(obj.contains(100));
		System.out.println(obj.isEmpty());
		System.out.println(obj);
		System.out.println(obj.remove(10));
		System.out.println(obj);
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(int a:obj)
		{
			System.out.println(a);
		}
	}
}