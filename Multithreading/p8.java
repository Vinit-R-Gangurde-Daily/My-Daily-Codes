


class MyThread extends Thread{

       public void run(){

          
          
	       System.out.println("in Mythread= " + Thread.currentThread().getName());
	       System.out.println("in Mythread= " + Thread.currentThread());

       }

}

class ThreadDemo{

        public static void main(String[] args){

                MyThread obj=new MyThread();
                obj.start();

                System.out.println("in main= " + Thread.currentThread().getName());

        }


}
