
//---------Array-----------------

// class p8 {

//     public static void main(String[] args) {
        
//     //------------type of array creation in java
       
//     //type1
//        int arr1[]=new int[]{1,2,3,4,5};
//         System.out.println(arr1[0]);

//     //type2
//         int arr2[]={6,7,8,9,10};
//         System.out.println(arr2[1]);

//     //type3
//          int arr3[]=new int[4];
//          arr3[0]=11;
//          arr3[1]=22;
//          arr3[2]=33;
//          arr3[3]=44;
//          System.out.println(arr3[2]);


         
    
//     }
    
// }


//--------------------

// class p8 {
//     public static void main(String[] args) {
        
//         int arr1[]=new int[]{1,2,3,4};
//         char arr2[]=new char[]{'A','B','C'};
//         float arr3[]=new float[]{1.2f,34.3f};
//         boolean arr4[]=new boolean[]{true,false,true};

//         System.out.println(arr1[0]);
//         System.out.println(arr1[1]);
//         System.out.println(arr1[2]);
//         System.out.println(arr1[3]);
//         System.out.println(arr1[4]);
//     }
    
// }


//----------------print array using for loop-----------

// class p8{
//     public static void main(String[] args) {
//         int arr[]=new int[]{1,2,3,4,5,6};

//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] +  " ");
//         }
//     }
// }


//------------------

// import java.util.Scanner;
// class f8{
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int siz=sc.nextInt();
         
//         int arr[]=new int[siz];
     
//         System.out.print("Enter the array elemenrt: ");
//         for(int i=0;i<arr.length;i++){
            
            
//             int ele=sc.nextInt();
//             arr[i]=ele;
//         }
        
//         System.out.println("array element: ");
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }

        

//     }
// }

//--------------------

// import java.io.*;

// class p8{

//     public static void main(String[] args)throws IOException {
        
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the array size: ");
//         int siz=Integer.parseInt(br.readLine());

//         int arr1[]=new int[siz];
 
//         int ev=0;
//         int od=0;
//         System.out.println("Enter the array element: ");
//         for(int i=0;i<arr1.length;i++){
          
//             int ele=Integer.parseInt(br.readLine());

//              arr1[i]=ele;
//              if(ele%2==0){
//                 ev++;
//                }else{
//                 od++;
//              }
//         }
//         System.out.println("Num of even number is " + ev);
//         System.out.println("Num of odd number is " + od);
          

//     }
// }


//--------------for each loop---------------------

// class f8{
//     public static void main(String[] args) {
//         int arr1[]={1,2,3,4,5};

//          for(int x : arr1){
//             System.out.println(x);
//          }
//     }
// }

//--------------------------------

// class f8{
//     public static void main(String[] args) {
//         int arr[]={10,20,30};

//         for(float x : arr){
//             System.out.println(x);
//         }

//     }
// }


//------------------


// class f8{
//     public static void main(String[] args) {
//         char arr[]={'A','B','C'};
//         int arr2[]={1,2,3,4};

//         for(char x : arr){
//             System.out.println(x);
//         }
//         System.out.println(arr);
//         System.out.println(arr2);
//     }
// }

//------------passing array as an parameter-------------------

// class p8{
    
//     void fun(int a,int b){
//         System.out.println(a);
//         System.out.println(b);
//         a=a+20;
//         b=b+20;
//         System.out.println(a);
//         System.out.println(b);
//     }
//     public static void main(String[] args) {
        
//         p8 obj=new p8();

//         int a=10;
//         int b=20;
//         System.out.println(a);
//         System.out.println(b);
        
//         obj.fun(a,b);

//         System.out.println(a);
//         System.out.println(b);
    
//     }
// }






//--------------------

// class p8{
//     public static void main(String[] args) {
//         int a=10;
//         int b=10;
//         Integer c=10; // a,b,c having a same identityHashCode
//         Integer d= new Integer(10); // new keyword is responsible for creationg a new object

        
//         System.out.println(System.identityHashCode(a));
//         System.out.println(System.identityHashCode(b));
//         System.out.println(System.identityHashCode(c));
//         System.out.println(System.identityHashCode(d));

//     }
// }

//--------------------------


// class p8{
    
//     void fun(int arr[]){

//         arr[0]=10;
//         arr[1]=20;
//     }
    
    
//     public static void main(String[] args) {
         
//         p8 obj=new p8();

//         int arr1[]={1,2,3,4,5};

//         System.out.println(System.identityHashCode(arr1[0]));
//         System.out.println(System.identityHashCode(arr1[1]));
//         System.out.println(System.identityHashCode(arr1[2]));
//         System.out.println(System.identityHashCode(arr1[3]));
//         System.out.println(System.identityHashCode(arr1[4]));

//         obj.fun(arr1);

//         System.out.println();

//         System.out.println(System.identityHashCode(arr1[0]));
//         System.out.println(System.identityHashCode(arr1[1]));
//         System.out.println(System.identityHashCode(arr1[2]));
//         System.out.println(System.identityHashCode(arr1[3]));
//         System.out.println(System.identityHashCode(arr1[4]));

    
//     }
// }









//-------------2'D array----------------


// class p8{
//     public static void main(String[] args) {
        
//         int arr1[][]=new int[2][1];

//         System.out.println(arr1.length);
//         System.out.println(arr1[0].length);

//         System.out.println(arr1);




//     }
// }


//-----------------------------------

// class p8{
//     public static void main(String[] args) {
        
//         int arr[][]=new int[2][2];

//         arr[0][0]=10;
//         arr[0][1]=10;
//         arr[1][0]=10;
//         arr[1][1]=10;

//         System.out.println(arr);
//         System.out.println(arr[1]);
//         System.out.println(arr[0]);
//         System.out.println(arr[0][0]);

//    }
// }

//----------------jagged array---------------
// class p8{
//     public static void main(String[] args) {
//         int arr[][]={{10,20,30,40},{50,60,70,},{80,90},{100}};

        
    
//         for(int i=0;i<arr.length;i++){

//             for(int j=0;j<arr[i].length;j++){

                
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

        
//         for(int[] i: arr){

//             for(int j: i){
//                 System.out.print(j + " ");
//             }
//             System.out.println();

//         }
    
//     }
// }


//------------------------------

// import java.io.*;
// class p8{
//     public static void main(String[] args)throws IOException{

    
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        
//         int arr1[][]=new int[3][];

//         arr1[0]=new int[3];
//         arr1[1]=new int[2];
//         arr1[2]=new int[1];


       
//         System.out.println("Enter the array ele: ");
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr1[i].length;j++){
                
//                 arr1[i][j]=Integer.parseInt(br.readLine());
//             }
//             System.out.println();
//         }
       
       
//     for(int [] x : arr1){

//             for(int y: x){
                
//              System.out.print(y + " ");
            
//             }
           
//             System.out.println();
//         }
//     }
// }

//--------------------------------



// class p8{
//     public static void main(String[] args) {
//         int arr1[][]=new int[4][];

//         arr1[0]=new int[]{1,2,3,4};
//         arr1[1]=new int[]{5,6,7};
//         arr1[2]=new int[]{8,9};
//         arr1[3]=new int[]{100};

//         for(int[] x : arr1){
//             for(int y : x){
//                 System.out.print(y + " ");
//             }
//             System.out.println();
//         }
//     }
// }



// class p8{
//         public static void main(String[] args) {
//             int arr1[][]=new int[4][];
    
//             arr1[0]=new int[]{100};
//             arr1[1]=new int[]{9,8,7};
//             arr1[2]=new int[]{6,5,4,3,2};
//             arr1[3]=new int[]{1};
    
//             for(int[] x : arr1){
//                 for(int y : x){
//                     System.out.print(y + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }


//--------------3'D  Array----------------


// class p8{
//     public static void main(String[] args) {

//         int arr1[][][]=new int[][][]{{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
        

//           for(int[][] x : arr1){
//             for(int[] y : x){
//                 for(int z: y){
//                     System.out.print(z + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println("---------------------");
//         }
        
//     }
// }

//----------------------------------

// import java.util.Scanner;
// class p8{
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);
//         int arr2[][][]=new int[2][3][4];
        
        

//         System.out.println(arr2.length);
//         System.out.println(arr2[0].length);
//         System.out.println(arr2[0][0].length);
         
    
//         System.out.print("Enter the array element: ");
//         for(int i=0;i<arr2.length;i++){

//         for(int j=0;j<arr2[i].length;j++){

//             for(int k=0;k<arr2[i][j].length;k++){
               
//                 arr2[i][j][k]=sc.nextInt();
//             }
            
//         }
    
//       }

    
        

//           for(int[][] x : arr2){
//             for(int[] y : x){
//                 for(int z: y){
//                     System.out.print(z + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println("---------------------");
//         }
        
//     }
// }

//-------------------------------


// import java.util.Scanner;
// class p8{
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("Enter how many num of 2'D array you want: ");
//         int num2D=sc.nextInt();

//         System.out.println("enter the num of rows you want: ");
//         int numrows=sc.nextInt();

//         System.out.println("Enter the num of col: ");
//         int numcol=sc.nextInt();
        
//         int arr2[][][]=new int[num2D][numrows][numcol];


        
        

//         System.out.println(arr2.length);
//         System.out.println(arr2[0].length);
//         System.out.println(arr2[0][0].length);
         
    
//         System.out.print("Enter the array element: ");
//         for(int i=0;i<arr2.length;i++){

//         for(int j=0;j<arr2[i].length;j++){

//             for(int k=0;k<arr2[i][j].length;k++){
               
//                 arr2[i][j][k]=sc.nextInt();
//             }
            
//         }
    
//       }

    
        

//           for(int[][] x : arr2){
//             for(int[] y : x){
//                 for(int z: y){
//                     System.out.print(z + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println("---------------------");
//         }
        
//     }
// }



//------------------------------------





// import java.util.Scanner;
// class p8{
//     public static void main(String[] args) {

    
        
//         int arr2[][][]=new int[2][][];

//          arr2[0][0]=new int[2][3];
//          arr2[0][1]=new int[][];
         
         
//          arr2[1][0]=new int[2][3];



//         //  arr2[0][0]=new int[][]{1,2,3};
//         //  arr2[0][1]=new int[][]{4,5};

//         //  arr2[1][0]=new int[][]{6,7,8};
//         //  arr2[1][1]=new int[][]{9};
//         //  arr2[1][2]=new int[][]{10};

        
        

//         System.out.println(arr2.length);
//         System.out.println(arr2[0].length);
//         System.out.println(arr2[0][0].length);
         
    
//         System.out.print("Enter the array element: ");
//         for(int i=0;i<arr2.length;i++){

//         for(int j=0;j<arr2[i].length;j++){

//             for(int k=0;k<arr2[i][j].length;k++){
               
//                 arr2[i][j][k]=sc.nextInt();
//             }
            
//         }
    
//       }

    
        

//           for(int[][] x : arr2){
//             for(int[] y : x){
//                 for(int z: y){
//                     System.out.print(z + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println("---------------------");
//         }
        
//     }
// }









//---------------------Null Pointer exception-------


class p8{
    public static void main(String[] args) {
        
        int arr1[][]={{},{},{}};
         
        int arr2[][]=new int[2][];

        System.out.println(arr1.length);
        System.out.println(arr1[0].length);
        
        System.out.println(arr2.length);
        System.out.println(arr2[0].length);
    }
}