
//Multithreading 

//1]---------------------

//first way of thread creation using the Thread class

// class Mythread extends Thread{
   
//     public void run(){ //run is a predefine thread method form thread due to this it will have the public access specifier
    
//         for(int i=0;i<10;i++){

//             System.out.println("in run");
//         }
         
//     }

// }

// class p17 {
    
//     public static void main(String[] args) {
        
        
//          Mythread obj=new Mythread();
//         obj.start();

//         for(int i=0;i<10;i++){

//             System.out.println("in main");
//         }

//     }
// }


//2]-----------------

// class Mythread extends Thread{

//     public void run(){

//         for(int i=0;i<10;i++){
//             System.out.println("in run");
       
//         try{
//             Thread.sleep(1000); //like a main class we do not able to throw the exception here because parent do not throw exception
//         }catch(InterruptedException obj){

            
//         }
//         }

//     }

    

// }

// class Client{

//     public static void main(String[] args)throws InterruptedException{
        

//         Mythread obj1=new Mythread();
//         obj1.start();

//         for(int i=0;i<10;i++){
//             System.out.println("in main");
//             Thread.sleep(1000);
//         }
//     }
// }

//3]-------------------------

//we can create the object of Mythread1 which is child of thread class and will run a multiple threads on same run method
// class Mythread1 extends Thread{

//     public void run(){
        
//         System.out.println("in Mythread1 run method");
//         System.out.println(Thread.currentThread().getName());

//     }
// }



// class Client{

//     public static void main(String[] args) {
        
//         Mythread1 obj1=new Mythread1();
//         obj1.start();
       
//         Mythread1 obj2=new Mythread1();
//         obj2.start();


        
//         System.out.println(Thread.currentThread().getName());

//     }
// }



//4]----------------------------
// class Mythread1 extends Thread{

//     public void run(){
        
//         System.out.println("in Mythread1 run method");
//         System.out.println(Thread.currentThread().getName());

//     }
// }

// class Mythread2 extends Thread{

//     public void run(){

//         System.out.println("in Mythread2 run method");
//         System.out.println(Thread.currentThread().getName());
//     }
// }

// class Client{

//     public static void main(String[] args) {
        
//         Mythread1 obj1=new Mythread1();
//         obj1.start();


//         Mythread2 obj2=new Mythread2();
//         obj2.start();

//         System.out.println(Thread.currentThread().getName());

//     }
// }

//5]---------------------------

//Second method of thread creation by using the Runnable Interface which is actualy the parent of Thread class
//must try following command on ubantu
//javap java.lang.Runnable
//javap java.lang.Thread

// class Mythread1 implements Runnable{

//     public void run(){

//         System.out.println("in run");
//         System.out.println(Thread.currentThread().getName());
//     }

// }

// class ThreadDemo{

//     public static void main(String[] args) {

//         Mythread1 obj1=new Mythread1();
//         Thread t=new Thread(obj1);
//         t.start();

//         System.out.println(Thread.currentThread().getName());

        
//     }
// }


//6]------------------
//thread Priority

// class Mythread extends Thread{

//     public void run(){

//         Thread t= Thread.currentThread();
//         System.out.println(t.getPriority());
//         System.out.println(Thread.currentThread());



//     }

// }

// class ThreadDemo{

//     public static void main(String[] args) {
        
//         Thread t=Thread.currentThread();
//         System.out.println(t.getPriority());

//         Mythread obj1=new Mythread();  //thread 0
//         obj1.start();

//        // obj1.setPriority(2);

//        // t.setPriority(7); //using this we can manuly set the priority of percualr thread
     
            
    

//         Mythread obj2=new Mythread(); //thread 1
//         obj2.start();
//        obj2.setPriority(3);//as the priority num is low it will have a higest priority
        
//         //System.out.println(Thread.currentThread().activeCount());
//     }
// }

//7]---------------------

//thread rename

// class Mythread extends Thread{

//     public void run(){

//         System.out.println(Thread.currentThread());
//         System.out.println(Thread.currentThread());
    
//     }

// }

// class ThreadDemo{

//     public static void main(String[] args)throws InterruptedException{

//         System.out.println(Thread.currentThread());

    
//         Mythread obj1=new Mythread();
//         obj1.start();
//         obj1.setName("vinit");

//         //Thread.sleep(100);

       
        
//         //System.out.println(Thread.currentThread());
//     }
// }


//8]----------------------------
//join (join is will use for exicutiong a one thread complitly uitil other will wait for its exicution)

// class MythreadDemo extends Thread{

//    public void run(){

//     for(int i=0;i<10;i++){
//         System.out.println("in vinit thread");

//         try{
//         Thread.sleep(3000);
//         }catch(InterruptedException obj){

//         }
//        }
//     }

// }

// class threadDemo{

//     public static void main(String[] args)throws InterruptedException {
        
//         MythreadDemo obj1=new MythreadDemo();
//         obj1.start();
//         obj1.setName("vinit");
//         obj1.join();

      
//         for(int i=0;i<10;i++){

//             System.out.println("in main thread");
//             //Thread.sleep(10);
//         }


//     }

// }


//9]-------------

// Yield

// class Mythread extends Thread{

//     public void run(){

//         for(int i=0;i<5;i++){
//             System.out.println(Thread.currentThread());

//             Thread.yield();
//         }

//     }

// }

// class ThreadDemo{

//     public static void main(String[] args) {

//         Mythread obj1=new Mythread();
//         Mythread obj2=new Mythread();

//         obj1.start();
//         obj2.start();


//     }
// }

//10]----------------

//another way to rename the thread 

// class Mythread extends Thread{


//     Mythread(String str){

//         super(str);

//     }

//     public void run(){
//              System.out.println(Thread.currentThread().getName());
//              System.out.println(getName());
//     }

// }

// class ThreadDemo{

//     public static void main(String[] args) {

//         Mythread obj=new Mythread("vinit");
//         obj.start();

        
//     }
// }


//11]-----------------------

//create the our own thread group(bydefault the name of threadGroup name is main)

// class Mythread extends Thread{


//     Mythread(ThreadGroup tg, String str){

//         super(tg,str);

//     }
//     public void run(){

//         System.out.println(Thread.currentThread());

//     }

// }

// class DemoThread{

//     public static void main(String[] args) {
        
        
//         ThreadGroup pThreadGroup =new ThreadGroup("Udayan Indesteris");
        
        
//         Mythread obj1=new Mythread(pThreadGroup,"Tours & Travels");
//         Mythread obj2=new Mythread(pThreadGroup, "Transport");
//         Mythread obj3=new Mythread(pThreadGroup,"Garage");

        

//         obj1.start();
//         obj2.start();
//         obj3.start();


//         ThreadGroup CThreadGroup =new ThreadGroup(pThreadGroup,"Udayan Groups");

//         Mythread obj4=new Mythread(CThreadGroup, "Agro");
//         Mythread obj5=new Mythread(CThreadGroup, "Farma");
//         Mythread obj6=new Mythread(CThreadGroup,"Hospital");

//         obj4.start();
//         obj5.start();
//         obj6.start();


//     }
// }

//12]--------------------

//renameing the thread and threadgroup using the Thread object

class Mythread implements Runnable{

    public void run(){

        System.out.println("In run method");
        System.out.println(Thread.currentThread());

        try{

            Thread.sleep(5000);
        }catch(InterruptedException obj){

            System.out.println(obj.toString());

        }

    }
}

class ThreadDemo{

    public static void main(String[] args) {
        
        ThreadGroup gThreadGP=new ThreadGroup("Udayan");
      
        Mythread obj2=new Mythread();
        Mythread obj3=new Mythread();

        Thread t1=new Thread(gThreadGP,obj2,"Transport"); //this is also another way of thrad group and thread renaming
        Thread t2=new Thread(gThreadGP,obj3,"tours & Tavels");

        t1.start();
        t2.start();



    }
}