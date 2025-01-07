/*
 
   Concorency methods in thread class

   1.sleep()
   2.join()
   3.yield()
 
 */

//1.sleep()

class MyThread extends Thread{

	public void run(){
	
		System.out.println("in run");
	
	
	}

}

class ThreadDemo{

	public static void main(String[] args)throws InterruptedException{
	
	MyThread obj=new MyThread();
	obj.start();

              Thread.sleep(100);




	
	} 


}
