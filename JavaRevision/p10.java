
//classes & Object


// class Core2Web{

//     int x=10;
//      static int y=10;
    
//      void fun(){
//         int z=30;
//      }
// }

// class p10 {
    
    
//     public static void main(String[] args) {

        
        
//     }
    
// }


//Constructor------------



// class Core2Web{

//     static int PP=30;    
//      int QQ=40;
//     Core2Web(){
//         System.out.println("In Core2Web Constructor");
//     }
//     public static void main(String[] args) {
//         int CC=10;
// 	     int zz=20;
//         Core2Web obj=new Core2Web();
//         }
// }


//--------------------------


// class IPL{


//     IPL(){
//         System.out.println("IN ipl const");
//     }

//     void fun(){a

//         IPL obj3=new IPL();
//     }
//     public static void main(String[] args) {
        
//         IPL obj1=new IPL();
//         IPL obj2=new IPL();

//         obj1.fun();


//     }
// }

//-------------------

// class manue{

//     int nuofma=9;
//     String str1="veg";
//     String str2="non-veg";

//     manue(){
//         System.out.println("IN constructor");
//     }

//     void lunch(){

//         System.out.println(str1);
//         System.out.println(str2);
//     }

// }

// class hotel{
//     public static void main(String[] args) {

//         manue obj=new manue();

//         obj.lunch();

//         System.out.println(obj.str1);
//         System.out.println(obj.str2);
        
//     }
// }


//-------------------------------------

class protectedcheck{

    private int x=10;
     String vinit="gangurde";
     String str1="vinit";

    void fun(){

        System.out.println(x);
    }


}

class p10 {

    public static void main(String[] args) {
     
        protectedcheck obj=new protectedcheck();
        obj.fun();
       // System.out.println(obj.x);

       System.out.println(obj.vinit);

        
    }
    
}




