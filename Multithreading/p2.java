/*
 
   in over rinding if parrent do not throws the exeception then child does not capable throws the exception in 

   same in this condition we extends Thread it meanse Thread class is parend and Mythread is child so
   as thread is throws any exception so mythread is not capable too throws any exception 

   in this condition we use try and catch only
 
 */



class Mythread extends Thread{

	public void run()  {//throws InterruptedException{  
	
		for(int i=0;i<10;i++){
		
			System.out.println("in run");
		       
			try{
			       Thread.sleep(200);
		
			}catch(InterruptedException obj){
			
			}
			
		}

	
	}

}




class ThreadDeom{

	public static void main(String[] args)throws InterruptedException{
	
		Mythread obj=new Mythread();
		 obj.start();
          	

	
		 for(int i=0;i<10;i++){
		 
		 
		
			 System.out.println("in main");
		          Thread.sleep(200); 
		 }
	}


}
