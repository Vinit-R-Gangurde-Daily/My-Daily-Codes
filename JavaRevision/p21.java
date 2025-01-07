//Recursion


//1]------------------------------------

// class Demo{

//     int temp=1;

//     int fact(int num){

        
//         if(num<=0){
//             return temp;

//         }

//         temp=temp*num;
//         fact(num-1);
        
//         return temp;
    
//     }

//     public static void main(String[] args) {
        
//         Demo obj1=new Demo();
//        int temp= obj1.fact(4);
//        System.out.println(temp);


//     }
// }


//2]--------------------------
//sum of all its less than digits eg. 5 = 5+4+3+2+1


// class SumON{


//     int recu(int num){

//         if(num<=0){
//             return num; 
//         }

//         return num + recu(--num);
//     }
//     public static void main(String[] args) {
        
//         SumON obj1=new SumON();

//         int temp=obj1.recu(5);

//         System.out.println(temp);


//     }


// }


//3]-------------------------------

//sum of all digits

// class SumOfAllDigits{

//     int sum=0;
//     int sumOf(int num){

//         if(num==0){
//             return 0;
//         }

       
//         return  num%10 + sumOf(num/10);
//     }


//     public static void main(String[] args) {
        
//         SumOfAllDigits obj1=new SumOfAllDigits();

//         int temp=obj1.sumOf(345);
//          System.out.println(temp);

//         // System.out.println(123%10);
    


//     }
// }


