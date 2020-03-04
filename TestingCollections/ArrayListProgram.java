import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		ArrayList<Integer> obj2=new ArrayList<Integer>();
		obj.add(12);
		obj.add(20);
		obj.add(30);
		obj2.add(10);
		obj2.add(40);
		obj2.add(50);
		obj.addAll(0,obj2);
		System.out.println("First Element is "+obj.get(0));
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(obj.remove(0));
		System.out.println("Printing content using for each loop");
		for(int a:obj)
		{
			System.out.println("Element in the list is "+a);
		}
	}
}