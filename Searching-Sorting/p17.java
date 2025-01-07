//mergesort practis

class mergepractis{

    
    void twoarr(int arr[],int start,int mid,int end){
 
          int m1=mid-start+1;
          int m2=end-mid;

          int arr1[]=new int[m1];
          int arr2[]=new int[m2];
          
          for(int i=0;i<m1;i++){

             arr1[i]=arr[start+i];
    
          }
          
          for(int z=0;z<m2;z++){
       
            arr2[z]=arr[mid+1+z];
        
          }
   
          int i=0,j=0,q=start;
          while(i<arr1.length && j<arr2.length){
         
               if(arr1[i]<arr2[j]){

                arr[q]=arr1[i];
                i++;
                
            }else{
                 
                arr[q]=arr2[j];
                j++;
              
            }
           q++;

          }

          while(i<arr1.length){
         
            arr[q]=arr1[i];
            i++;
            q++;


          }

          while(j<arr2.length){

            arr[q]=arr2[j];
            j++;
            q++;
          }
    }
    
    void mer(int arr[],int start,int end){

        if(start<end){

            int mid=start+(end-start)/2;

            mer(arr,start,mid);
            mer(arr,mid+1,end);
       
            twoarr(arr,start,mid,end);



        }



    }
    public static void main(String[] args){

        int arr[]=new int[]{9,1,8,2,7,3,6,4};
       
       for(int i=0;i<arr.length;i++){
       
	       System.out.print(arr[i]+" ");
       }
        System.out.println();       
        mergepractis obj=new mergepractis();
          int start=0;
          int end=arr.length-1;
         
          obj.mer(arr,start,end);
          
	  for(int i=0;i<arr.length;i++){
	  
		  System.out.print(arr[i]+" ");
	  }
         System.out.println();
    }



}
