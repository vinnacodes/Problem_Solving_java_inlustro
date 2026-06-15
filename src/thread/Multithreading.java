package thread;

public class Multithreading {


    public static void main(String[] args) {

      Thread t1 = new MyThread();


      t1.run();

        for (int i=0;i<100;i++){


            System.out.println(   t1.getName()+" main thread----------- ");
        }

    }
}


class MyThread  extends Thread{

    public void run(){


        for(int i=0;i<100;i++){


            System.out.println( getName());

        }
    }




}
