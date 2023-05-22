package InheritanceSuper;

public class ChildClass extends ParentClass{
    public void test()
    {
        System.out.println("Child class");
        test1();
    }
    public static void main(String args[])
    {
        ParentClass obj=new ChildClass();
        obj.test1();
        ChildClass obj1=new ChildClass();
        obj1.test();
        ChildSuper obj2=new ChildSuper();
        obj2.test1();
        ParentClass obj3=new ChildSuper(); //It calls childsuper method. Check y shud v write parentclass
        obj3.test1();
    }
}
