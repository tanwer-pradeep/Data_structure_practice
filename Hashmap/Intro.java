// package Hashmap;

import java.util.HashMap;

public class Intro {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        System.out.println(hm);

        // adding elements use "hm.put(key, value)"
        hm.put("India", 100);
        hm.put("Usa", 200);
        hm.put("UK", 300);

        System.out.println(hm);

        // now if the key we want to add already exist then it will 
        // be updated with its new value

        hm.put("India", 500);
        hm.put("Pakistan", 600);

        System.out.println(hm);

        // for loop we can use for each loop as it doesnot contain any 
        // indexing or order of storage

        for( String k : hm.keySet()){
            System.out.print(k + "-->" + hm.get(k) + " ");
        }



    }
    
}
