

class MyThread implements runable{

	public void run(){
	
		System.out.println("in run");
		System.out.println(Thread.currentThread().getName());
	
	}



}




class ThreadDemo{

	public static void main(String[] args){
	
	
		MyThread obj=new MyThread();
                 Thread obj1=new Thread(obj);
		   obj1.Thread();


	
	}

}








