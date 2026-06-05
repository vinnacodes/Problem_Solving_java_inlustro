package collections.arraylistProblems;

import java.util.ArrayList;
public class FindMaxInArrayList {

    public static void main(String[] args) {


       ArrayList<Integer> li = new ArrayList<>();


       li.add(4);
       li.add(5);
       li.add(45);
       li.add(3);
       li.add(-3);

       int max =li.get(0);



      for(int num : li){

          System.out.println(num);



      }


        System.out.println(max);

    }


}
