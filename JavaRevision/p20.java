
// //Linear Search

// import java.io.*;
// class LinearSearchDemo{

//     static int fintArrele(int ele,int arr[]){

    
//         for(int i=0;i<arr.length;i++){

//             if(arr[i]==ele){
//                 return i;
//             }

//         }
//       return -1;
//     }


//     public static void main(String[] args)throws Exception{
        
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

//         System.out.println("Enter the size of array: ");
//         int siz=Integer.parseInt(br.readLine());

//         int arr[]=new int[siz];

//         System.out.println("enter the array elements: ");

//         for(int i=0;i<arr.length;i++){

//             arr[i]=Integer.parseInt(br.readLine());
//         }

//         for(int x: arr){
//             System.out.println(x);
//         }

//         System.out.println("Enter the element you want to search:  ");
//         int sear=Integer.parseInt(br.readLine());


//        int temp=fintArrele(sear,arr);

//        if(temp == -1){
//         System.out.println("element do not found in array");
//        }else{
//         System.out.println("element found at index: " + temp);
//        }

//     }
    

// }


//