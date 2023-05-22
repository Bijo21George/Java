package ExceptionHandling;

public class ThrowThrows {
    public void testthrow(int age)
    {
        if(age<18)
        throw new ArithmeticException("not eligible");
        else
            System.out.println("eligible");
    }
    public static void main(String args[])
    {
        ThrowThrows obj=new ThrowThrows();
        obj.testthrow(15);
    }
}
