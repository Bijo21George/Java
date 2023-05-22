public class MethodOverloading {

    public static void main(String[] args)
    {
        MethodOverloading overloading=new MethodOverloading();
    overloading.add(2,3);
    overloading.add(1,2,3);
    }

    /**
     * this method is to add two integer values
     * @param a this parameter is used to store first value which needs to be added
     * @param b this parameter is used to store second value which needs to be added
     */
    public void add(int a,int b)
    {
        int c= a+b;
        System.out.println("add of 2 nos: "+c);
    }
    public void add(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("add of 3 nos: "+d);
    }
}
