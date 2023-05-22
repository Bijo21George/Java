package ExceptionHandling;

public class TryCatchFinally {
    public static void main(String args[])
    {
        TryCatchFinally obj=new TryCatchFinally();
        int[] a= {1,2,3,4,5};
        obj.printArrayValues(a,10);
    }
    public void printArrayValues(int[] a, int n){
        for(int i: a)
        {
            System.out.println("Array values "+i);
        }
        try {
            System.out.println(a[n]);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("you can print only 5 numbers");
        }
        finally
        {
            System.out.println("executed using finally");
        }

    }
}
