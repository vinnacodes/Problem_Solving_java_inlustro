package collections.hashmapproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {


    public static void main(String[] args) {


        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(5);
        a.add(4);

        hs.addAll(a);








for(int i : hs){

            System.out.println(i);
        }
    }

}