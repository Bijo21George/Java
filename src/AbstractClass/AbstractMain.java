package AbstractClass;

/**
 * This is the main class demonstrating abstract class concept
 */
public class AbstractMain {
    public static void main(String args[])
    {
        AbstractClass abs; //cannot create obj for abstract classes or interface hence create reference
        abs=new Class1();
        abs.getRate();
        abs.calculate(120);
        abs=new Class2();
        abs.getRate();
        abs.calculate(120);
    }
}
