//------------------String------------------------

// class p9 {

//     public static void main(String[] args) {
        
//         String str1="Core2Web";
        
//         String str2=new String("Core2Web");

//          char str3[]={'C','2','B'};

//          String str4="Core2Web";

//          String str5=new String("Core2Web");

//         System.out.println(System.identityHashCode(str1));
//         System.out.println(System.identityHashCode(str2));
//         System.out.println(System.identityHashCode(str3));

//         System.out.println(System.identityHashCode(str4));
//         System.out.println(System.identityHashCode(str5));
//         //System.out.println(System.identityHashCode(str3));

//     }
// }



// class p9{
//     public static void main(String[] args) {
        
//         String str1="Vinit";

//         String str2="Gangurde";

//         String str3="VinitGangurde";

//         String str4=str1+str2;

//         System.out.println(System.identityHashCode(str1));
//         System.out.println(System.identityHashCode(str2));
//         System.out.println(System.identityHashCode(str3));
//         System.out.println(System.identityHashCode(str4));

//     }
// }


//-------Predefine java Methods-------------------


//concat
// class p9{
//     public static void main(String[] args) {
        
//         String str1="Vinit";
//         String str2="Gangurde";

        
//         System.out.println(str1);
//         System.out.println(str2);

//         System.out.println(str1+str2);
//         System.out.println(str1.concat(str2));

//         String str5=str1+str2;
//         String str6=str1.concat(str2);

//         System.out.println(str5.hashCode()); //hash code will compare the data and genrate the code
//         System.out.println(str6.hashCode());


//         System.out.println(str5==str6);

//         System.out.println(System.identityHashCode(str5));//give the address of genrated object
//         System.out.println(System.identityHashCode(str6));
        
//         System.out.println(str1);
//         System.out.println(str2);

//         // String str3="VinitGangurde";
//         // String str4=new String("VinitGangurde");

//         // System.out.println(str3==str4);//compare the identityhashcode
//         // System.out.println(str3.equals(str4));//compare the contain(data)
        
  
//     }
// }




//2)length(give the num of char in string)

// class p9{

//     public static void main(String[] args) {
        
//         String str1="Vinit";

//         System.out.println(str1.length());
//     }

// }






//3) CharAt

// class p9{
//     public static void main(String[] args) {
//         String str1="Vinit";

//         System.out.println(str1.charAt(0));
//         System.out.println(str1.charAt(1));
//         System.out.println(str1.charAt(2));
//         System.out.println(str1.charAt(3));
//         System.out.println(str1.charAt(4));
//     }
// }



//4) compareTo

// class p9{

//     public static void main(String[] args) {
        
//         String str1="Vinit";
//         String str2="Vinit";

//         String str3=new String("Vinit");

//          System.out.println(str1.compareTo(str3));

//         System.out.println(str1.compareTo(str2));


//     }
// }

//5)compareToIgnoreCase


// class p9{
//     public static void main(String[] args) {
        
//         String str1="Vinit";
//         String str2="viNpT";
//         String str3=new String("viNit");

//         System.out.println(str1.compareToIgnoreCase(str3));
//     }
// }

//6) equals  (compare the contain of the string)

// class p9{
//     public static void main(String[] args) {
        
//         String str1="Vinit";
//         String str2="vinit";
    
//         String str3=new String("Vinit");

//         System.out.println(str1.equals(str3));
//         System.out.println(str1.equals(str2));

//         System.out.println(str1==str3);
//     }
// }


//7)toCharArray

// class p9{
//     public static void main(String[] args) {
        
//         String str1="Vinit";

//         char arr[]=str1.toCharArray();

//         for(char x:arr){
//             System.out.println(x);
//         }
//     }
// }



//8)equalsIgnoreCase

// class p8{

//     public static void main(String[] args) {
        
//          String str1="viniT";
//          String str2="viNit";

//          System.out.println(str1.equalsIgnoreCase(str2));

//     }
// }

//9)indexof

// class p8{

//     public static void main(String[] args) {

//         String str1="Vinit";

//         System.out.println(str1.indexOf('i', 2));
//         System.out.println(str1.indexOf('i'));
        
//     }
// }


//10)lastIndexf

// class p8{
//     public static void main(String[] args) {
//         String str1="Vinit";

//         System.out.println(str1.lastIndexOf('i',3));
//         System.out.println(str1.lastIndexOf('i'));

//     }
// }

//11)replace

// class p9{

//     public static void main(String[] args) {
//         String str1="Vinit";

//         System.out.println(str1);
//         System.out.println( str1.replace('i','e'));
//     }
// }

//12)SubString

// class p9{

//     public static void main(String[] args) {
        
//         String str1="vinit";

//         System.out.println(str1.substring(1,4));//ini
//     }
// }


//---write a funtion which is work as predefine length funtion---------

// import java.io.*;
// class myCharLengthFun{

//     static int charLen(String str1){

//         char arr[]=str1.toCharArray();

//          return arr.length;

//      }

//     public static void main(String[] args)throws IOException{

//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
//         System.out.println("Enter the String: ");
//         String str=br.readLine();

//         //myCharLengthFun obj=new myCharLengthFun();
        
//         int len=charLen(str);
//         System.out.println(len);

//     }
// }



//---------String Buffer------------

// class p9{
//     public static void main(String[] args) {
        
//       //  StringBuffer str1=new StringBuffer("Vinit");
//         String str2=new String("Vinit");
//         String str3="Vinit";

//         StringBuffer str4=new StringBuffer();

        
//         // System.out.println(System.identityHashCode(str1));
//         // System.out.println(System.identityHashCode(str2));
//         // System.out.println(System.identityHashCode(str3));

//         // str1.append("Gangurde");
//         // System.err.println(str1);

//         // System.out.println(str1.capacity());

//         System.out.println(str4.capacity());
//         System.out.println(str4);
//         str4.append("Vinit");
//         System.out.println(str4.capacity());
//         System.out.println(str4.capacity());
        
//         str4.append("gangurde patilwada chalisgaon");
//         System.out.println(str4);
        



//     }
// }

class p9{
    public static void main(String[] args) {
        
        String str1="Vinit";
        String str2=new String("Gangurde");
        StringBuffer str3=new StringBuffer("chalisgaon");

        StringBuffer str4=str3.new StringBufferappend(str1);
        System.out.println();

    }
}