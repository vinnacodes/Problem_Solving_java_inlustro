package array;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {

        int arr[] = {3,0,4,0,5};

        Solution.moveZeroes(arr);





    }
}

class Solution {
    public static void moveZeroes(int[] nums) {


        int pos =0;


        int sc=0;
        int n =nums.length;


        while(sc< n){


            if (nums[sc]!=0){


                nums[pos++]= nums[sc];
            }
            sc++;
        }


        for(int i=pos;i<n;i++){

            nums[i]=0;


        }

        System.out.print(Arrays.toString(nums));
    }

}