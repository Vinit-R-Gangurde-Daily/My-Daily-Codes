//fixed size sub arry using carry forword

class DemoPrefix{
    public static void main(String[] args){

        
        int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};
         int k=4;
        int Prefixarr[]=new int[arr.length];
        Prefixarr[0]=arr[0];
        for(int i=1;i<Prefixarr.length;i++){

            Prefixarr[i]=Prefixarr[i-1]+arr[i];
        }

        int start=0;
        int end=k-1;
       int MaxSum=Integer.MIN_VALUE;
        while(end<Prefixarr.length){

            int Sum=0;
          if(start==0){
            Sum=Prefixarr[end];
          }else{
            Sum=Prefixarr[end]-Prefixarr[start-1];     
          }
           if(Sum>MaxSum){
            MaxSum=Sum;
           }
        }
                  System.out.println(MaxSum);
    }

}
