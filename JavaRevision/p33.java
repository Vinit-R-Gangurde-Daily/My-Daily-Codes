
//19/10/2024
//bubble sort

// public class p33 {


//     public static void main(String[] args) {
         
//         int arr[]=new int[]{7,3,9,4,2,5,6};


//         for(int i=0;i<arr.length;i++){

//             for(int j=0;j<arr.length-i-1;j++){

                
//                 if(arr[j]>arr[j+1]){
                    
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }
                  
//             }
//         }


//         for(int x:arr){
//             System.out.print(x + " ");
//         }

//     }
    
// }


//insertion sort


// class p33{


//     public static void main(String[] args) {
        
//         int arr[]=new int[]{2,1,5,3,4};

//         for(int i=1;i<arr.length;i++){
          
//             int temp=arr[i];
//             int j=i-1;

//             while(j>=0 && arr[j]>temp){
               
//                 arr[j+1]=arr[j];
//                 j--;

//             }
//             arr[j+1]=temp;
             
//         }

    

//     for(int x:arr){
//         System.out.print(x + " ");
//     }
//  }

// }

//selection sort

// class p33{

//     public static void main(String[] args) {
        
//         int arr[]=new int[]{4,1,5,2,3};

//         for(int i=0;i<arr.length;i++){

//             int minIndex=i;

//             for(int j=i+1;j<arr.length;j++){

//                 if(arr[minIndex]>arr[j]){

//                     minIndex=j;
//                 }

//             }

//             int temp=arr[i];
//             arr[i]=arr[minIndex];
//             arr[minIndex]=temp;


//         }

//         for(int x:arr){

//             System.out.print(x + " ");
//         }
//     }

// }


//merge sort


// class p33{

//     static void mergearray(int arr[],int start,int mid,int end){

//         int len1=mid-start+1;
//         int len2=end-mid;




//        int arr1[]=new int[len1];
//         int arr2[]=new int[len2];

              
//         for(int i=0;i<arr1.length;i++){

//             arr1[i]=arr[start+i];

//         }

//         for(int i=0;i<arr2.length;i++){

//             arr2[i]=arr[mid+1+i];
//         }
       
//        // int arr3[]=new int[len1+len2];

//         int x=0;
//         int y=0;
//         int z=start;
//         while(x<arr1.length && y<arr2.length){

//             if(arr1[x]<arr2[y]){
//                 arr[z]=arr1[x];
//                 x++;
//             }else{
//                 arr[z]=arr2[y];
//                 y++;
//             }
//             z++;
//         }

//         while(x<arr1.length){

//             arr[z]=arr1[x];
//             z++;
//             x++;

//         }

//         while (y<arr2.length){

//             arr[z]=arr2[y];
//             z++;
//             y++;
            
//         }

//     }
//     static void mergesortDemo(int arr[],int start,int end){

//         if(start<end){

//             int mid=start+(end-start)/2;


//            mergesortDemo(arr, start, mid);
//            mergesortDemo(arr, mid+1, end);


//            mergearray(arr,start,mid,end);

//         }
//     }
//     public static void main(String[] args) {
        
//         int arr[]=new int[]{9,7,5,3,4,6,8};
 
//         int start=0;
//         int end=arr.length-1;

//         mergesortDemo(arr,start,end);

//         for(int x:arr){
//             System.out.print(x + " " );
//         }

//     }

// }



//quick sort

class p33{

    static int partision(int arr[],int start,int end){

        int pivote=arr[end];
        int i=start-1;

        for(int j=start;j<end;j++){
 
            if(arr[j]<=pivote){

                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }


        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;

        return i;
    }

    static void QuickSort(int arr[],int start,int end){

        if(start<end){

            int pivote=partision(arr,start,end);

            QuickSort(arr, start, pivote-1);
            QuickSort(arr, pivote+1, end);

        }


    }


    public static void main(String[] args){

        int arr[]=new int[]{6,3,9,5,2,8};


        QuickSort(arr,0,arr.length-1);

        for(int x: arr){

            System.out.print(x +" ");
        }



    }
}