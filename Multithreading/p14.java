

class MyThread extends Thread{

	MyThread(String str){

	     super(str);	
	
	}
	MyThread(){
	}
	
	public void run(){
	
		Thread t=Thread.currentThread();
		

		//System.out.println(t.getName());
		
		System.out.println(getName());//here we can use getName directly becouse it is a method of Thread class
					      //and it will inherit in MyThread
		//System.out.println(t);
	
	}

}

class ThreadDemo{

	public static void main(String[] args){
	
		MyThread obj1=new MyThread("first thread");
		obj1.start();

		MyThread obj2=new MyThread("second thread");
		obj2.start();

		Thread t=Thread.currentThread();
		 //System.out.println(t.getName());
		// System.out.println(getName()); it will give error as can not find symbol becouse it will not inharit 
		// in main
		 //System.out.println(t);
	
	}

}
