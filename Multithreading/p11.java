

//2.join()


class MyThread extends Thread{


	public void run(){

		for(int i=0;i<10;i++){
		
			System.out.println("in run");
		            
       try{
                Thread.sleep(1000);
        }catch(InterruptedException obj){

           }		
		
	
	}
  
  }



}


class ThreadDemo{

	public static void main(String[] args)throws InterruptedException{
	
	
		MyThread obj=new MyThread();
		obj.start();

		//Thread.sleep(500);
                    
		obj.join();
		
		    for(int i=0;i<10;i++){
		
			//Thread.sleep(500);
			System.out.println("in main");
		}

	
	}



}
