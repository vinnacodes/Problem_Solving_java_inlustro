package Java8features;

public class SamMethod {

    public static void main(String[] args) {


        caller(()->{});


    }

  static  void caller(Phone p){

        System.out.println("calling");


    }


}


interface Phone{


    void call();
}
