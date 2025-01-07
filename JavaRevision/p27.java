
//cognizant problem
public class p27{
    

   static void bubblesortfun(int arr2[],int length,int i){

       if(i==length-1){
        return;
       }else{

             if(arr2[i]>arr2[i+1]){

                int temp=arr2[i+1];
                arr2[i+1]=arr2[i];
                arr2[i]=temp;                
             }
       }

       bubblesortfun(arr2, length, i+1 );



    }

   static void bubblesort(int arr1[],int length){

        if(length==0){
            return ;
        }else{

        // for(int i=0;i<length-1;i++){
  
        //      if(arr1[i]>arr1[i+1]){
        //         int temp=arr1[i+1];
        //         arr1[i+1]=arr1[i];
        //         arr1[i]=temp;
        //      }

           bubblesortfun(arr1, length,0);
             
        }
            
        bubblesort(arr1,length-1);
}
    public static void main(String[] args){

        int arr[]=new int[]{2,5,1,4,3};



       

        // for(int i=0;i<arr.length;i++){

        //     for(int j=0;j<arr.length-i-1;j++){

        //         if(arr[j]>arr[j+1]){

        //             int temp=arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }


        bubblesort(arr,arr.length);

        for(int x:arr){
            System.out.println(x);
        }

    }
}

