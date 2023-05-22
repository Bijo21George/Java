public class MethodOverriding1 extends MethodOverriding2{
    public static void main(String[] args)
    {
        MethodOverriding1 obj=new MethodOverriding1();
        obj.test();
        obj.supermethod();
    }
    public void supermethod()
    {
        super.test();
    }
    public void test()
    {
        System.out.println("override1");
    }
}