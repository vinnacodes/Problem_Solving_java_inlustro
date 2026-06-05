package collections.arraylistProblems;

import java.util.ArrayList;
public class RemoveDuplicates {


    public static void main(String[] args) {


//        Remove Duplicates from List
//        Problem: Given an ArrayList with duplicate values, remove all duplicates and print unique elements.
//        Input: [1, 2, 2, 3, 4, 4, 5]
//        Output: [1, 2, 3, 4, 5]



        ArrayList<Integer> li =new ArrayList<>();


        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(1);


        ArrayList<Integer> temp = new ArrayList<>();


        for (int num : li){

            if(! (temp.contains(num)) )

            {
                temp.add(num);
            }
            }


        System.out.println(temp);
        }









    }






