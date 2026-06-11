package Java8features;

public class LambaStoringUsage {


    public static void main(String[] args) {
        // 1. Define the lambda and store it



        Votable v =(a)-> a>40;

        v.voting();





        }




interface Votable{

     boolean  voteCheck (int  age);

     default void voting(){


         System.out.println("default method running");








     }


}





    }


