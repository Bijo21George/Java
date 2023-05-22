package Interviewprogs;

public class SwapnosWithoutThird {
    public static void main(String args[])
    {
        SwapnosWithoutThird obj=new SwapnosWithoutThird();
        int i = 5;int j=15;
        System.out.println("Correct nos a= " +i+"b= " +j);
        obj.swap1(i,j);
    }
    public void swap1(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Reverse no a= "+a+" b= "+b);
    }
}
