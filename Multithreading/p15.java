
class MyThread extends Thread{

	MyThread(ThreadGroup thr,String str){
	
	
		super(thr,str);
	
	}
        public void run(){

               Thread t=Thread.currentThread();
               System.out.println(t.getName());
        
               System.out.println(t);

        }

}

class ThreadDemo{

        public static void main(String[] args){

        ThreadGroup mygroup=new ThreadGroup("Meta");      
	      
	MyThread obj1=new MyThread(mygroup,"facebook");
                obj1.start();

        MyThread obj2=new MyThread(mygroup,"instagram");
               obj2.start();
               
	       Thread t=Thread.currentThread();

          ThreadGroup AmaGp=new ThreadGroup("Amazon");

	         MyThread obj3=new MyThread(AmaGp,"AmaPrime");
	    	   obj3.start();

		 MyThread obj4=new MyThread(AmaGp,"AmaVideo");
		    obj4.start();
            

        }

}
