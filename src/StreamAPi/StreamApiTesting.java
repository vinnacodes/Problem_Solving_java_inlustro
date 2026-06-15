package StreamAPi;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTesting {


    public static void main(String[] args) {




        List<Integer> li = new ArrayList<>();

        li.add(4);
        li.add(5);

        li.stream().filter((n)->n%2==0).forEach(n-> System.out.println(n));

      }


    // find the even numbers



void unique(int [] arr){


        arr.stream().distinct().forEach(n-> System.out.println(n));



}








}
