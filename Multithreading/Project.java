
/*

class MyThread extends Thread{
     
	MyThread(String str){
	
		super(str);
	
	}


	public void run(){
	
	         // System.out.println("start thread" + getName());

		System.out.println(getThreadGroup());
		System.out.println( activeCount());
		System.out.println(threadId());
	       	//  fun();
		  //System.out.println("thread end" +getName());
	
	}

	void fun(){
	
	   try{
		Thread.sleep(1000);
	   }catch(InterruptedException br){
	   
	   
	   }
	}



}

class Project{

    public static void main(String[] args){
    
	    MyThread obj=new MyThread("xyz");
	    obj.start();
   
             obj.fun();
 	   // System.out.println(Thread.currentThread());
	  
    }


}*/


/*
class MyThread implements Runnable{

        MyThread(String str){
	
		super(str);
	
	}
	public void run(){

                  System.out.println("Thread start " + Thread.currentThread().getName());

                  fun();
                  System.out.println("Thread end " + Thread.currentThread().getName());

        }

        void fun(){

           try{
                Thread.sleep(1000);
           }catch(InterruptedException br){


           }
        }



}

class Project{

    public static void main(String[] args){

            MyThread obj=new MyThread();
            
	    Thread ob=new Thread(obj,"Rahul");
	    ob.start();

             obj.fun();
            System.out.println(Thread.currentThread().getName());
    }


}


*/


/*
class MyThreadGp extends Thread{

       MyThreadGp(ThreadGroup br,String str){
       
	       super(br,str);
       
       }	

	public void run(){
	 
	       System.out.println("Thread start: " + Thread.currentThread());	
	        //Thread.sleep(2000); 
	      // System.out.println("Thread start: " + Thrad.currentThread());
	
	
	}



}

class ThreadDemo{

	public static void main(String[] args){
	
    ThreadGroup Ind=new ThreadGroup("india");

         MyThreadGp Mu=new MyThreadGp(Ind,"Mumbai");
	  Mu.start();

         MyThreadGp Pu=new MyThreadGp(Ind,"pune");
	 Pu.start();
	
	
          ThreadGroup Ame=new ThreadGroup(Ind,"America");	
	       
	       MyThreadGp NA=new MyThreadGp(Ame,"new York");
	       NA.start();

	       MyThreadGp LA=new MyThreadGp(Ame,"Los Angeles");
	       LA.start();
	}

}

*/



class MyThreadGp implements Runnable{

   

        public void run(){

               System.out.println("Thread start: " + Thread.currentThread());
                //Thread.sleep(2000);
              // System.out.println("Thread start: " + Thrad.currentThread());


        }



}

class ThreadDemo{

        public static void main(String[] args){

		

    ThreadGroup Ind=new ThreadGroup("india");

         MyThreadGp Mu=new MyThreadGp();
         Thread obj1=new Thread(Ind,Mu,"Mumbai"); 
	 obj1.start();

         MyThreadGp Pu=new MyThreadGp();
	 Thread obj2=new Thread(Ind,Pu,"pune");
         obj2.start();


          ThreadGroup Ame=new ThreadGroup(Ind,"America");

               MyThreadGp NA=new MyThreadGp();
	       Thread obj3=new Thread(Ame,NA,"New York");
               obj3.start();

               MyThreadGp LA=new MyThreadGp();
	       Thread obj4=new Thread(Ame,NA,"Los Angeles");
               obj4.start();
        }

}




























