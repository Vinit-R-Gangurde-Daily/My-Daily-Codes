
//hiddent this pointer


// class Demo{

//     int x=10;
//     Demo(){ // Demo(Demo this)

//         System.out.println("In p12 Constructor");
//         System.out.println(this);
//         System.out.println(x);
//     }

//     void fun(){ //fun(Demo this)
//         System.out.println("In fun method ");
//         System.out.println(this);
//         System.out.println(x);
//     }
//     public static void main(String[] args) {
        
//         Demo obj=new Demo(); //p12(obj)

//         obj.fun(); //internaly it will coes like fun(obj)

//         System.out.println("in main");
//         System.out.println(obj);

        

//     }
    
// }


//----------------------

// class Demo{

    
//     Demo(){
//         System.out.println("In no arrgument constructor");
//     }
   
//     Demo(int x){
//         System.out.println("In Int constructor");
//     }

//     Demo(char y){

//         System.out.println("In char constructor");

//     }

//        public static void main(String[] args) {
        
//         Demo obj1=new Demo();

//         Demo obj2=new Demo('A');

//         Demo obj3=new Demo(10);



//     }
// }

//--------------------

// class Demo{

//     Demo(){
//         System.out.println("in costructor");

//         Demo obj1=new Demo();
//     }

//     {
//         System.out.println("in instance block");
//        // Demo obj2=new Demo();
//     }

//     static{
//         System.out.println("in static block");
//        // Demo obj2=new Demo();
//     }
//     public static void main(String[] args) {
        
//        // Demo obj1=new Demo();

//     }
// }

//------------------------



 class Demo{

    private int x=10;
    static int y=20;
    Demo(){
        
        System.out.println("in constructor 1");
    }
    Demo(int x,int y){
        super();
        //this(); //both super & this is same
        this.x=x;
        System.out.println(x);
        System.out.println("in constructor 2");
        System.out.println(this.x);
        System.out.println(this.y);
        System.out.println(y);
    }

    Demo(char x){
        this();
        System.out.println("in constructor 3");
        
    }

    void fun(int x,int y){

        this.x=x;
        this.y=y;
        System.out.println(this.x);
        System.out.println(this.y);

        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
        
        Demo obj1=new Demo();

        //Demo obj2=new Demo(2,3);

     //   Demo obj3=new Demo('A');

       obj1.fun(1,2);

    }
}


//---------------Sater & gatter---------


// class Player{

//     private String Playername=null;
//     private int jerno=0;
//     Player(String Playername,int jerno){

//         this.Playername=Playername;
//         this.jerno=jerno;

//     }


//     void display(String Playername,int jerno){
       
//         this.Playername=Playername;
//         this.jerno=jerno;
//         System.out.println(this.Playername);
//         System.out.println(this.jerno);

//     }
// }

// class Client{

//     public static void main(String[] args) {
//         int x=20;
       
//         Player obj=new Player("virat",7);
//         obj.display("rahul",5);
//   }

// }

//---------change the value of private variable---------


// class Player{

//     private int x=10;
//     int y=20;

    
//     private String name=null;
//     private int jerno=0;
//     Player(String name,int jerno){

//         this.jerno=jerno;
//         this.name=name;
//     }

//     void info(){
//         System.out.println(jerno + "= " + name);
//     }
// }


// class Client{
//     public static void main(String[] args) {
        
//         Player obj=new Player("virat", 7);
//         obj.info();
        
//         System.out.println(obj.y);
//     }
// }


//----------------

// class Demo{

//     private String name=null;
//     private int jerno=0;
    

//    void fun(String name,int jerno){
                
//         this.name=name;
//         this.jerno=jerno;

//         System.out.println(name + " = " + jerno);

//     }
   
//     void run(){

//         System.out.println(name + " = " + jerno);

//     }

// }

// class Client{

//     public static void main(String[] args) {

//         Demo obj=new Demo();

//         obj.fun("virat",7);
//         obj.run();
        
//     }
// }


















