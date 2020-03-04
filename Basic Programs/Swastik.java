class Pattern
{
	public static void main(String[] args)
	{
	for(int i =0;i<6;i++)
	{
		for(int  j=0;j<9;j++)
		{
			if(j>=1 && j<4 || i>1 && i<5)
			{System.out.print("  ");}
		}
	}
	}
}