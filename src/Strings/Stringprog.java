package Strings;

import java.util.Locale;

/**
 * Create a string and find length of the string
 */
public class Stringprog {
    public static void main(String args[])
    {
        String s1="Hello";
        String s2="Hiiiiii";
        String s3=s1+s2; // or use s1.concat(s2)
        String s4="hello";
        String s5="hello";
        if(s4==s5)
        {
            System.out.println(("same"));
        }
        else
        {
            System.out.println(("not same"));
        }
        int n=s3.length();
        boolean x=s1.equals(s2);
        boolean y=s1.equalsIgnoreCase(s4);
        System.out.println(s3);
        System.out.println(n);
        System.out.println(x);
        System.out.println(y);
        System.out.println(s1.charAt(1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s4));
        System.out.println(s1.startsWith(s4));
        System.out.println(s1.startsWith("Hel"));
        System.out.println(s4.startsWith(s5));
        System.out.println(s1.endsWith(s4));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.trim());
    }

}
