package array;

import java.util.ArrayList;
import java.util.HashMap;

public class FindMissingNums {

    public static void main(String[] args) {
        int [] arr ={1,2,5};

        findMissingnums(5, arr);
    }


    public static void findMissingnums(int n , int [] arr) {

        ArrayList<Integer>  mNums =new ArrayList<>() ;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {

            freq.put(num, 1);
        }

        for (int i=1; i<=n ;i++){

            if (!(freq.containsKey(i))){

                mNums.add(i);
            }

        }

        System.out.println(mNums);
    }
}

