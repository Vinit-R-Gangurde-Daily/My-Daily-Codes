

class MyThread extends Thread{

   public void run(){
   
	   Thread T=Thread.currentThread();
	    System.out.println(T.getName());  
	    System.out.println(T.getPriority());////bydefault the priority of any thread is 5
   
   }

}


class ThreadDemo{

	public static void main(String[] args){
	
          
		Thread T=Thread.currentThread();
		System.out.println(T.getName());
		System.out.println(T.getPriority());

		T.setName("vinit");//use to change the name of thread 

		System.out.println(T.getName());
	       
          MyThread obj=new MyThread();
	   obj.start();
            
	  // obj.start();//Exception in thread "main" java.lang.IllegalThreadStateException
                          // onse we state ony thread we do not starte it again

                           	  

	
	}


}
