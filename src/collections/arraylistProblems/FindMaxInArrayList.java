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



       for (int i =0;i<li.size();i++){


           if (li.get(i)>max){


               max =li.get(i);
           }

       }


        System.out.println(max);

    }


}
