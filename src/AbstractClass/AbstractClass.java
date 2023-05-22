package AbstractClass;

import javax.swing.text.PlainDocument;

/**
 * Creating an Abstract class with an Abstract method getRate()
 * This class also contains non abstract methods
 */
public abstract class AbstractClass {
    protected double rate;
    public abstract void getRate();
    public void calculate(int units)
    {
        System.out.println("Bill amount for " +units+ "units:");
        System.out.println(rate * units);
    }
}
