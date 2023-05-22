package Collections;
/**
 * This program is to create Hashset and add elements to it
 * and print elements using for each loop and iterator
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetForEachIterator {
    public static void main(String args[])
    {
        HashSet<String> daysofWeek=new HashSet<>();
        daysofWeek.add("Monday");
        daysofWeek.add("Tuesday");
        daysofWeek.add("Wednesday");
        daysofWeek.add("Thursday");
        daysofWeek.add("Friday");
        daysofWeek.add("Saturday");
        daysofWeek.add("Sunday");
        daysofWeek.add("Monday");
        System.out.println(daysofWeek);
        for(String i:daysofWeek)
        {
            System.out.println(i);
        }
        Iterator<String> itr=daysofWeek.iterator();
        while(itr.hasNext())
        {
            String str=itr.next();
            System.out.println("Iterator ");
            System.out.println(str);
        }
        // remove elements
        daysofWeek.remove("Monday");
        System.out.println(daysofWeek);
    }

}
