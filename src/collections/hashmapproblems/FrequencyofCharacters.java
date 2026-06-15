package collections.hashmapproblems;

import java.util.HashMap;

public class FrequencyofCharacters {


    public static void main(String[] args) {


        freq("dcbagasjghoriahgxes");

    }


    public static  void freq(String name){


        HashMap<Character,Integer> freq =new HashMap<>();


        for (int i=0; i<name.length();i++){


            freq.put(name.charAt(i), (freq.getOrDefault(name.charAt(i),0))+1);




        }

        System.out.println(freq);








    }

}
