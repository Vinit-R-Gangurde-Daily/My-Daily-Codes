
                      
import java.util.concurrent.*;


class MyThread implements Runnable{

	int num=0;
	MyThread(int num){
	
		this.num=num;
	
	}

	public void run(){
	
		System.out.println(Thread.currentThread() + "start thread" + num);
                        fun();
		System.out.println(Thread.currentThread() + "end Thread" + num);
	
	}
	void fun(){

	try{	
		Thread.sleep(3000);
	}catch(InterruptedException ie){
	
	}
	
	}


}

class ThreadPoolDemo{

	public static void main(String[] args){
	

	ExecutorService ser = Executors.newCachedThreadPool();

		for(int i=1;i<5;i++){
		
			MyThread obj=new MyThread(i);
			ser.execute(obj);

		}
	
	}

}
