


class MyThread extends Thread{

	public void run(){
	
		
			System.out.println(Thread.currentThread().getName());
	
	}

}




class ThreadDemo{

	public static void main(String[] args)throws InterruptedException{
	
	
		MyThread obj=new MyThread();
		obj.start();

		System.out.println(Thread.currentThread().getName());
	
	
	}


}
