package Interviewprogs;

public class FactorialRecursion {
    public static void main(String args[])
    {
        FactorialRecursion obj=new FactorialRecursion();
        int y=obj.facto(0);
        System.out.println(y);
    }
    public int facto(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int x= n*facto(n-1);
        return x;
        //System.out.println("factorial of "+n+" is "+fact);

    }
}
