
// class employee{

//     String name="vinit";
//     int EMid=22;

//    static int Salaury=100000;

//     void fun(){

//         System.out.println("Name: " + name);
//         System.out.println("Employee id: " + EMid);
//         System.out.println("Salaury: " + Salaury);
//     }

// }

// class p11{
    
//     public static void main(String[] args) {
        
//         employee obj1=new employee();
//         employee obj2=new employee();

//          obj1.fun();
//          obj2.fun();

//          obj1.name="rahul";
//          obj1.EMid=33;
//          obj1.Salaury=200000;

//          obj1.fun();
//          obj2.fun();



        
//     }
// }
//



//----------------drow a figure for this----------



// class Demo{

//     String name="Vinit";
//     int x=20;
//     private int y=30;
//     static int z=40;

//     void disp(){
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//     }

// }

// class Client{
//     public static void main(String[] args) {
        
//         Demo obj1=new Demo();
//         Demo obj2=new Demo();

//         obj1.disp();
//         obj2.disp();

//         obj1.x=200;
//         obj1.z=400;

//         obj1.disp();
//         obj2.disp();

        
//         System.out.println("----------------------");
  
//         System.out.println(Demo.z);// we can access the static vari & methods using the class name
        
//         }
// }


//--------Static variable & Static Methods---------

// class StaticDemo{

//     static int x=20;
//     static int y=30;

//     static void disp(){

//         System.out.println(x);
//         System.out.println(y);
//     }

    
// }

// class Demo{

//     public static void main(String[] args){

//         System.out.println(StaticDemo.x);
//         System.out.println(StaticDemo.y);

//         StaticDemo.disp();
//     }
// }



//--------Static block--------------

// class Demo{

//     int x=20;
//     static int y=30;
//     static{
//         System.out.println("In static block");
//         System.exit(0);
//         System.out.println(y);
       
        
//     }
//     // static{

//     //     System.out.println("In second static block");
//     // }
//     public static void main(String[] args) {
//         //System.out.println("hellow ");
//         Demo obj=new Demo();
//     }
// }

//-------------------------

// class Demo{

//     static int x=20;
//     int y=20;
//     static{
//        // static int a=20;
//         int b=20;
      
//     }

//     void fun(){

//        //  static int c=20;
//         int d=20;

//        //System.out.println(c);
//     }
//     public static void main(String[] args) {

//         Demo obj=new Demo();
//         obj.fun();
        
//     }
// }


//----------Instance(variable,block,funtion)-----------------


// class Demo{

//     int x=10; //Instance variable(non-static global variable)


//     Demo(){

//         System.out.println("In demo Constructor");
//     }
//     {
//         System.out.println("Instance block"); //Instance block
//     }


//     void fun(){ //Instance method(non-static method)

//         System.out.println("in instance method fun");
//     }
//     public static void main(String[] args) {
        
//         Demo obj=new Demo();

//         obj.fun();



//     }

//     {
//         System.out.println("In static block 2");
//     }
// }


//--------------------


class Demo{

    int x=10;
    static int y=20;

    Demo(){

        System.out.println("in Demo Constructor");
    }

    static{

        System.out.println("in static block 1");
    }
    {
        System.out.println("In instance Block 1");
    }
    public static void main(String[] args) {
        
          Demo obj1=new Demo();
    }

    static{

        System.out.println("In static block 2");
    }
    {
        System.out.println("in Instance block 2");
    }
}
