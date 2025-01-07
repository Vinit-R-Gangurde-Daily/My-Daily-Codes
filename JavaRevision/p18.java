
//Thread Pool

// import java.util.concurrent.Executor;
// import java.util.concurrent.ExecutorService;

import java.util.concurrent.*;

class Mythread implements Runnable{
    
    int num=0;

    Mythread(int num){

        this.num=num;
    }

    public void run(){

        System.out.println(Thread.currentThread() + " start " + num);
         fun();
        System.out.println(Thread.currentThread() + " end " + num);

    }
    
    void fun(){

        try{

            Thread.sleep(8000);
        }catch(InterruptedException obj){
        
        }

    }

}

class TheadDemo{

    public static void main(String[] args) {
        
       // ExecutorService ser=Executors.newCachedThreadPool();
        ExecutorService ser = Executors.newCachedThreadPool();
        //newCachedThreadPool();

    }
}