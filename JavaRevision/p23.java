//Bubble Sort


//1]------------------------------

//bubbble sort (solve by me )

// class BubbleSortDemo{

//    void BubbleSortfun(int arr1[]){

//             //int head=0;

//             for(int j=0;j<arr1.length;j++){

//                 int head=0;
//             for(int i=1;i<arr1.length-j;i++){

                
//                      if(arr1[head]>arr1[i]){
//                           int temp=arr1[head];
//                           arr1[head]=arr1[i];
//                           arr1[i]=temp;
//                           head=i;
//                      }
//                      if(arr1[head]<arr1[i]){
//                         head=i;
//                      }
 
                    
//             }
//         }
//     }
    

//     public static void main(String[] args) {
        
//         int arr1[]=new int[]{7,3,9,4,2,5,6};

//         BubbleSortDemo obj1=new BubbleSortDemo();

//         obj1.BubbleSortfun(arr1);

//         for(int x: arr1){
//             System.out.println(x);
//         }

//     }

// }


//2]----------------------

//bubble sort (solve using the sir method )
//both are same only diff is in program  1  i am use a head & i here head is replace by i other is same
//and we use a swap to save the etteration when array is already sorted

// class BubbleSortDemo{

//     int count=0;
//    void BubbleSortfun(int arr1[]){

//             boolean swapped=false;

//             for(int j=0;j<arr1.length;j++){

            
//             for(int i=0;i<arr1.length-j-1;i++){

//                 count++;
                
//                      if(arr1[i]>arr1[i+1]){
//                           int temp=arr1[i];
//                           arr1[i]=arr1[i+1];
//                           arr1[i+1]=temp;
//                           swapped=true;
                        
//                      }
                    
//               }
//               if(swapped==false){ //this swape will help us to save the etteration when the array is already sorted
//                 break;
//               }
              
//         }
//         System.out.println("count=" + count);
//     }
    

//     public static void main(String[] args) {
        
//         // int arr1[]=new int[]{7,3,9,4,2,5,6};

//         int arr1[]=new int[]{1,2,3,4,5,6,7,8,9};

//         BubbleSortDemo obj1=new BubbleSortDemo();

//         obj1.BubbleSortfun(arr1);

//         for(int x: arr1){
//             System.out.println(x);
//         }

//     }

// }


//bubble sort using a recursion


// class BubbleSortDemo{


//     void BuubbleSortfun(int arr[],int arrlen){

//         if(arrlen==0){
//             return ;
//         }

//         boolean flage=false;
//         for(int i=0;i<arrlen-1;i++){
             
//             if(arr[i]>arr[i+1]){

//                 int temp=arr[i];
//                 arr[i]=arr[i+1];
//                 arr[i+1]=temp;
//                 flage=true;

//             }
               
//         }
//         if (flage==false) {
//             return ;
//         }
//         BuubbleSortfun(arr, arrlen-1); 

//     }
//     public static void main(String[] args) {
        
//         int arr[]=new int[]{7,3,9,4,2,5,6};
        
//         BubbleSortDemo obj1=new BubbleSortDemo();

//         obj1.BuubbleSortfun(arr,arr.length);

//         for(int x:arr){
//             System.out.println(x);
//         }
//     }

// }


//Ooooo wow i will do it yessssssss
//bubble sort using recursion and not a single for loop

// class BubbleSortDemo{

//    
//     void Buuble(int arr[], int len,int arrlen){

//         if(len>=arrlen-1){
//             return;
//         }else{

             
//             if(arr[len]>arr[len+1]){

//                 int temp=arr[len];
//                 arr[len]=arr[len+1];
//                 arr[len+1]=temp;
//                 

//             }
//         }
//          Buuble(arr, len+1, arrlen);   
//     }
       

//     void BuubbleSortfun(int arr[],int arrlen){

//         if(arrlen==0){
//             return ;
//         }else{
       
//             Buuble(arr,0,arrlen);
        
     
        
//     }
//         BuubbleSortfun(arr, arrlen-1); 

//     }
//     public static void main(String[] args) {
        
//         int arr[]=new int[]{7,3,9,4,2,5,6};
        
//         BubbleSortDemo obj1=new BubbleSortDemo();

//         obj1.BuubbleSortfun(arr,arr.length);
        

//         for(int x:arr){
//             System.out.println(x);
//         }
//     }

// }


