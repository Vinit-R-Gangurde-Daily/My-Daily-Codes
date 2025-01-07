
class Demo extends Thread{

	public void run(){
	
	                                     // Thread.currentThread().getName()
		System.out.println("in Demo= " + Thread.currentThread().getName());
	
	}


}



class MyThread extends Thread{

       public void run(){
      
	      Demo obj1=new Demo();
	       obj1.start(); 
	       System.out.println("in Mythread= " + Thread.currentThread().getName());

       }

}

class ThreadDemo{

	public static void main(String[] args){
	
		MyThread obj=new MyThread();
		obj.start();

		System.out.println("in main= " + Thread.currentThread().getName());
	
	}


}
