import java.util.*;
class Demo
{
	public static void main(String[] args)
	{
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		System.out.println(a.removeFirst());
		System.out.println(a.removeLast());
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.add(100));
		System.out.println(a.get(0));
		System.out.println(a.indexOf(100));
		System.out.println(a.peek());
		System.out.println(a.poll());
		System.out.println(a);
		System.out.println(a.remove());
		System.out.println(a);
	}
}