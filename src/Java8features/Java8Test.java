package Java8features;

public class Java8Test {


    public static void main(String[] args) {


        Thread t1 = new Thread(()-> System.out.println("Runnable object is working here by lambda"));

        t1.start();

    }


}



