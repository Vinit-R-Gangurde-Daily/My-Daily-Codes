
//----part-1-----------------

// public class MergeSort{

//     void MergeSortMethod(int arr[],int start, int end){
      
//         if(start<end){
//              int mid=(start+end)/2;
        

//         System.out.println("Start: " + start + " Mid:" +  mid + " End:" + end);
        

//         MergeSortMethod(arr, start, mid);
//         MergeSortMethod(arr,mid+1,end);
//         }
//     }
    
    
//     public static void main(String[] args) {
        
//         int arr[]=new int[]{9,1,8,2,7,3,6,4};

//         int start=0;
//         int end=arr.length-1;

//         MergeSort obj=new MergeSort();

//         obj.MergeSortMethod(arr, start, end);
//     }
    
// }



//---part-2-----------



class Demo{

    public static void main(String[] args) {
        
        int arr1[]=new int[]{3,7,9,11};
        int arr2[]=new int[]{2,5,8};

        int p=arr1.length+arr2.length;

        int arr3[]=new int[p];

        int q=0;
        int j=0;
        int k=0;

      while(j<arr1.length && k<arr2.length){

            if(arr1[j]<arr2[k]){
          
                arr3[q]=arr1[j];
             j++;
             
            }else{
                arr3[q]=arr2[k];
                k++;
        
            }
          q++;    

        }

        while (j< arr1.length) {
            arr3[q]=arr1[j];
            j++;
            q++;
            
        }

        while (k < arr2.length) {
            arr3[k]=arr1[j];
            k++;
            q++;
            
        }




        for(int x: arr3){
            System.out.print(x + " ");
        }
    }

}

