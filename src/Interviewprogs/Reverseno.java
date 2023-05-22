package Interviewprogs;

import java.util.Scanner;

public class Reverseno {
    public static void  main(String args[])
    {
        Reverseno obj=new Reverseno();
        Scanner sc=new Scanner(System.in);
        obj.reverse1(125);
    }
    public void reverse1(int n)
    {
        int rev=0;
        while(n!=0)
        {
            int x=n%10;
            n=n/10;
            rev=(rev*10)+x;
        }
        System.out.println(rev);
    }
}
