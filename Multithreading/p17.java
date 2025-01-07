

class MyThreade implements Runnable{
      
	public void run(){

             System.out.println(Thread.currentThread());
		     try{
			  Thread.sleep(3000);	
              }catch(InterruptedException obj){
	      

	      
	      }
	
	
	}

}



class ThreadDemo{


	public static void main(String[] args){
	
		ThreadGroup Ind=new ThreadGroup("India");

		MyThreade Mum=new MyThreade();
		MyThreade Pun=new MyThreade();

		Thread obj1=new Thread(Ind,Mum,"Mumbai");
		obj1.start();
		Thread obj2=new Thread(Ind,Pun,"pune");
                obj2.start();
	
	
	}
}
