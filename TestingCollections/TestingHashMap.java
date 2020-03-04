import java.util.*;

class Demo
{
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> obj=new HashMap<Integer,Integer>();
		obj.put(10,100);
		obj.put(20,200);
		obj.put(30,300);
		System.out.println(obj);
		System.out.println(obj.get(10));
		
	}
}