/*
 
   in this program we create 3 thread

 
 
 */


class Demo extends Thread{

	public void run(){
	
	
		System.out.println("in Demo= "+ Thread.currentThread().getName());
	
	}

}

class MyThread extends Thread{

	public void run(){
	

		System.out.println("in run= "+Thread.currentThread().getName());
	
	        Demo obj=new Demo();
		obj.start();

	}

}



class ThreadDemo{

	public static void main(String[] args){
	
		MyThread obj= new MyThread();
		 obj.start();
	
	System.out.println("in main= " + Thread.currentThread().getName());
	
	}


}
