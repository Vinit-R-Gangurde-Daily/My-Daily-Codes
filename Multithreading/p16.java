

class MyThreadGp extends Thread{

	MyThreadGp(ThreadGroup gr,String str){  //MyThread(ThreadGroup thr,String str)
	
		super(gr,str);
	
	}
	
	public void run(){
	
	     System.out.println(Thread.currentThread());
	
	}


}

class ThreadGpDemo{

	public static void main(String[] args){
	
	   ThreadGroup IndGp=new ThreadGroup("India");

	   MyThreadGp Mum=new MyThreadGp(IndGp,"Mumbaii");
	   Mum.start();

	   MyThreadGp Pun=new MyThreadGp(IndGp,"pune");
           Pun.start();  

               
	           ThreadGroup PackGp=new ThreadGroup(IndGp,"pakisthan"); //child thread group of india
                    
		   MyThreadGp Lavo=new MyThreadGp(PackGp,"Lahor");
		   Lavo.start();
		    MyThreadGp Esla=new MyThreadGp(PackGp,"Eslamabate"); 
                     Esla.start();

	
	}
}
