class Testing
{
    void show()
    {
        System.out.println("I am show of Outer Class");
    }
    class InnerClass
    {
        void printmessage()
        {
            System.out.println("I am In the Inner Class in of Object");
        }
    }
}

class UseInnerClass
{
    public static void main(String[] args0)
    {
        Testing obj=new Testing();
        obj.show();
        Testing.InnerClass test=obj.new InnerClass();
        test.printmessage();
    }
}