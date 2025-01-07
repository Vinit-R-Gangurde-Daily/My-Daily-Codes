
class MyThread extends Thread{


    public void run(){
    
	    for(int i=0;i<10;i++){
	    
		    System.out.println("in run");
	    
             try{	   
 		    Thread.sleep(100); 
	     }catch(InterruptedException obj){
	     
	     
	     }
	    }
    
    }
}



class ThreadDemo{

	public static void main(String[] args)throws InterruptedException{
	
             MyThread obj=new MyThread();
	     obj.start();

	     for(int i=0;i<10;i++){
	     
		     Thread.sleep(100);
		     System.out.println("in main");

	     
	     }
	
	
	}

}
