class TestString
{
	public static void main(String[] args)
	{
		String a="Devansh";
		String b="    DevanshD    ";
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println("SubString is ");
		System.out.println(a.substring(0,6));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.concat(b));
		System.out.println(a.compareTo(b));  // Will return a value < 0 if first string is less than other value > 0 if it is greater and 0 if it is equals.
		System.out.println(b.length());
		System.out.println(b.trim());
		System.out.println(b.startsWith("D"));
		System.out.println(b.endsWith(" "));
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(b.isEmpty());
		System.out.println(b.replace("D","P"));
		System.out.println(b.indexOf('D'));
		System.out.println(b.lastIndexOf("D"));
		System.out.println(String.valueOf("1232Hello"));
	}
}