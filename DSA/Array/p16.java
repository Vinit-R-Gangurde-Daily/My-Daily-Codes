


class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{3,2,4};
		int N=2;
		int T=6;

		for(int i=1;i<N;i++){
		
			arr[i]=arr[i-1]+arr[i];
		
		}
		

	      for(int i=1;i<N;i++){
	      
		      if(arr[1]==T){
		      
                                  
			      System.out.println("[1,2]");
			      break;
		      
		      }if(arr[i]-arr[i-2]==T){                                              //arr[1]==T  (arr[i]-arr[i-2]==iT
		      
                                   System.out.println(i +","+ (i-1));
		      
		      }
	      
	      }
	
	
	}


}
