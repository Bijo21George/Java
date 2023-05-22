package Collections;
/**
 * Program for printing hashmap elements using for each loop
 */

import java.util.*;

public class HashMapEx {
    public static void main(String args[])
    {
        Map<Integer,String> hm=new HashMap<>();
        hm.put(1,"a");
        hm.put(2,"b");
        for(Map.Entry<Integer,String> ent : hm.entrySet()){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }
    }
}
