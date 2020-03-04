class Demo
{
	public static void main(String[] args)
	{
		StringBuffer b2=new StringBuffer();
		b2.insert(0,"Another string in b2");
		System.out.println(b2.length());
		System.out.println(b2);
		System.out.println(b2.capacity());
		System.out.println(b2.charAt(1));
		System.out.println(b2.capacity());
		System.out.println(b2.reverse());
	}
}