

//Runable Interface with Lambda funtion

class ThreadDemo{

	public static void main(String[] args){
	
		Runnable obj1= ()->{
	
			
				System.out.println("thread name is " + Thread.currentThread().getName());
			
		
		};

		
		Thread T1=new Thread(obj1);
		T1.start();


	
	
	}

}
