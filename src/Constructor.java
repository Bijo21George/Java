import javax.xml.namespace.QName;

/**
 * this class explains both constructor concepts and constructor overloading concept
 */
public class Constructor {
    String name;
    int age;

    public Constructor() {
        name = "bijo";
        age = 33;
    }

    public Constructor(String name, int age) {
        name = name;
        age = age;

    }

    /**
     * this is main method, execution flow starts from here
     * @param args
     */
    public static void main(String args[]) {
        Constructor constructor = new Constructor();
        constructor.printNameAndAge();

        // parameterised constructor
        Constructor constructor1 = new Constructor("George", 11);
        constructor1.printNameAndAge();
    }

    /**
     *
     */
    public void printNameAndAge() {
        System.out.println("printing name and age");
        System.out.println(name + " " + age);
    }
}
