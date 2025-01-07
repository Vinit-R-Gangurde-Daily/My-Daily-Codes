

//Insertion sort

// class InsertionSortDemo{
    
//     public static void main(String[] args) {
        
//         int arr[]=new int[]{2,1,5,3,4};



//         for(int i=0;i<arr.length;i++){

//             int temp=arr[i];
//             int j=i-1;

//             while(j>=0 && arr[j]>temp){

//                 arr[j+1]=arr[j];
//                 j--;
//             }
//              arr[j+1]=temp;
//         }

//     }
// }



//-----------------------------


// class InsertionDemo{

//     void InsertionMeth(int arr[],int len){

//         if(len>=arr.length-1){
//             return;
//         }
       
//         int temp=arr[len];
//         int j=len-1;
//         while(j>=0 && arr[j]>temp){

//             arr[j+1]=arr[j];
//             j--;
//         }
//            arr[j+1]=temp;

//            InsertionMeth(arr, len+1);
//     }
//     public static void main(String[] args) {
        
//         InsertionDemo obj1=new InsertionDemo();

//         int arr[]=new int[]{2,1,5,3,4};

//         obj1.InsertionMeth(arr,1);

//         for(int x: arr){
//             System.out.println(x);
//         }



//     }
// }