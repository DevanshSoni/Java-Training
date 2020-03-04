import java.util.ArrayList;
class TestList
{
	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList();
		obj.add(10);
		obj.add("Devansh");
		obj.add("Samarth");
		obj.add(212);
		obj.add(true);
		System.out.print(obj.get(0));
		System.out.println(obj.remove(0));
		System.out.println(obj.get(0));
		System.out.println(obj.isEmpty());
		System.out.println(obj.toArray());
		System.out.println(obj.size());
	}
}