

import java.util.concurrent.*;
class MyThreadPool implements Runnable{

        int num=0;  
	MyThreadPool(int num){
  
		this.num=num;
  }
	
	public void run(){
	
		System.out.println(Thread.currentThread() + "Thread Start " + num);
                   fun();
		System.out.println(Thread.currentThread() + "Thread End " + num);
	
	}

	void fun(){

         try{
	   Thread.sleep(3000);	
	 }catch(InterruptedException obj){
	 
	 }
	}

}

class ThreadPoolDemo{

	public static void main(String[] args){
	
		//ExecutorService br=Executors.newSingleThreadExecutor();
	
		//ExecutorService br=Executors.newFixedThreadPool(2);
		//
	          AbstractExecutorService br=(AbstractExecutorService)Executors.newFixedThreadPool(2);
		for(int i=1;i<=4;i++){
		
			MyThreadPool obj=new MyThreadPool(i);
                         br.execute(obj);
			 
	             	}

	}


}
