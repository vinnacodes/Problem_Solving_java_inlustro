package array;
import java.util.HashMap;
public class FindTheMissingNumber {


    public static void main(String[] args) {


int [] arr={1,2,3,5,6,7};
    int miss_num =  findMissingnum(7,arr);
        System.out.println(miss_num);
    }

   public static int findMissingnum( int n , int[] arr){

      int  actualSum = 0;
      int arraySum=0;

        for (int i =1; i<=n ;i++){

            actualSum =actualSum+i;
        }
        for (int num : arr){

            arraySum = arraySum +num;
        }

        return actualSum-arraySum;








    }

    // arr (n =5; arr ={1,2,5}


}
