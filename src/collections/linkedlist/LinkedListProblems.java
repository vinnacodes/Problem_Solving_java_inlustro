package collections.linkedlist;

import java.util.LinkedList;
public class LinkedListProblems {

    public static void main(String[] args) {

//        Train Coach Management
//        Problem: Simulate train coaches. Add coaches at front and back. Remove the last coach. Print order.
//        Input: Add: Engine at front, Coach1, Coach2, Guard at back. Remove last.
//        Output: [Engine, Coach1, Coach2]
//

        LinkedList<String> train = new LinkedList<>();


        //addEngine "Engine"



            train.addFirst("Engine");

            train.addLast("Coach1");
            train.addLast("coach2");

            train.addLast("guard");


            for(String name : train){


                System.out.print(name + " ->");
            }







    }



}
