

import java.util.concurrent.*;
class MyThreadPool implements Runnable{

	int num=0;
	MyThreadPool(int num){
	
		this.num=num;

	}
	public void run(){
                 
		System.out.println(Thread.currentThread() + "thread start" + num);

		fun();
		System.out.println(Thread.currentThread() + "thread end" + num);

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
	
	      //Executor st=Executors.newSingleThreadExecutor();

		Executor st =Executors.newFixedThreadPool(5);
	
	      for(int i=1;i<=10;i++){
	      
		      MyThreadPool obj=new MyThreadPool(i);
	               st.execute(obj);      
	      }
	}

}
