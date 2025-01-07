
// Binary Search


//implementation using non recursue method
// import java.util.*;
// class BinarySearchNormal{

//     static int BinarySearchfun(int arr[],int find){

//         int start=0;
//         int end=arr.length-1;

//         while(start<=end){

//             int mid=(start+end)/2;

//             if(arr[mid]==find){
//                 return mid;

//             }

//             if(arr[mid] > find){

//                 end=mid-1;
//             }

//             if(arr[mid]<find){
//                 start=mid+1;
//             }

//         }

//         return -1;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);

//         System.out.println("enter the size of array: ");
//         int siz=sc.nextInt();

//         int arr[]=new int[siz];

//         System.out.println("enter the array elements: ");
//         for(int i=0;i<arr.length;i++){

//             arr[i]=sc.nextInt();
//         }
              
//         System.out.print("enter the element you want to search: ");
//         int ele=sc.nextInt();

//        int index= BinarySearchfun(arr,ele);

//         if(index==-1){
//             System.out.println("element do not find in array ");
//         }else{
//             System.out.println("element find at index: " + index);
//         }



//     }
// }


//implementaion using the recursive method

class BinarySearchDemo{

    static int Binary(int arr[],int find,int start,int end){

        if(start>end){
            return -1;
        }else{

        int mid=(start+end)/2;
              
        if(find==arr[mid]){
            return mid;
        }
        if(find > arr[mid]){
            
            //start=mid+1;
            return Binary(arr, find, mid+1, end);
        }else{

           return Binary(arr, find, start, mid-1);
        }
      }

    }
    public static void main(String[] args) {
        
        int arr[]=new int[]{12,23,34,45,68,78,89,99};

        int start=0;
        int end=arr.length-1;
           int temp=Binary(arr,99,start,end);      
           System.out.println("index: " + temp); 



    }
}
