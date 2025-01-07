

class Democarry{

    public static void main(String[] args){

        int arr[]=new int[]{-3,4,-2,5,3,-2,8,2,1,4};
        int N=4;

        int start=0;
        int end=N-1;
        int Maxsum=Integer.MIN_VALUE;

         while(end<arr.length){
        int sum=0;
        for(int i=start;i<=end;i++){

            sum=sum+arr[i];
         if(sum>Maxsum){
            Maxsum=sum;
         }

        }
        start++;
        end++;
      }
System.out.println(Maxsum);
    }


}

