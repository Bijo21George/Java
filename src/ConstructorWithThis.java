import javax.xml.namespace.QName;

/**
 * this class explains about this keyword usage when the globla variable and method variable names are same.
 */
public class ConstructorWithThis {
    String name;
    int age;

    public ConstructorWithThis() {
        name = "bijo";
        age = 33;
    }

    public ConstructorWithThis(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public static void main(String args[]) {
        ConstructorWithThis constructor = new ConstructorWithThis();
        constructor.printNameAndAge();

        // parameterised constructor
        ConstructorWithThis constructor1 = new ConstructorWithThis("George", 11);
        constructor1.printNameAndAge();
    }

    public void printNameAndAge() {
        System.out.println("printing name and age");
        System.out.println(name + " " + age);
    }
}
