import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		TreeMap<String,Integer> obj=new TreeMap<String,Integer>();
		obj.put("First",1200);
		obj.put("Sec",1200);
		obj.put("Third",1200);
		obj.put("Fourth",1200);
		System.out.println(obj.get("First"));
		System.out.println(obj);
	}
}