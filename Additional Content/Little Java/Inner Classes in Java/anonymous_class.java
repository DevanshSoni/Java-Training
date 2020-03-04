interface demo
{
    public void show();
}

class Test
{
    public static void main(String[] args)
    {
        demo d=new demo(){
            public void show()
            {
                System.out.println("Hello I am from Anonymous Class World");
            }
        };
        d.show();
    }
}