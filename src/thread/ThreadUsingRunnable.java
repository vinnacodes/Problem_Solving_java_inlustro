package thread;

public class ThreadUsingRunnable {


    public static void main(String[] args) {


        Thread t1 = new Thread(new Worker());




        t1.start();



try {
    t1.join();
}

catch (InterruptedException e){



}

        System.out.println(Thread.currentThread().getName());
    }



}


class Worker implements Runnable{



   public void run(){

       for(int i=0; i<5;i++){


           System.out.println("  newly  created Thread "  );
       }
   }







}
