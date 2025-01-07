


// Runnable Interface with Anonimmus Inner Class


import java.util.*;
class ThreadDemo{

	public static void main(String[] args){
	
		Runnable obj1=new Runnable(){
		
			public void run(){
			
			
				System.out.println(Thread.currentThread().getName());
			
			}
		
		};

		Runnable obj2=new Runnable(){
		
		
			public void run(){

				System.out.println(Thread.currentThread().getName());
			
			}
		
		};

		Thread T1=new Thread(obj1);
                       T1.start();

		  Thread T2=new Thread(obj2);
		       T2.start();

	
	}

}
