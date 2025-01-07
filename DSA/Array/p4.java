


class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{9,4,1,3,9,2,6,7};
              
		int N=8;
		int max=Integer.MIN.VALUE;
  
		int num=0;
		for(int i=0;i<N;i++){
		
		      if(max<arr[i]){
		      
			       num=max;
			      max=arr[i];
		      }
		
		}
	System.out.println(num);
	}

}
