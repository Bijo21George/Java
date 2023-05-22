public class ClassAa extends ClassBb {
    public static void main(String args[]) {
        ClassAa obj = new ClassAa();
        obj.add(2, 3);
        obj.method2();
    }
    public void method2() {
        super.add(2, 3);
    }

    public void add(int x, int y) {
        System.out.println("classa addmethod" + x + y);
    }
}