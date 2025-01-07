


class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{1,2,3,1,3,4,6,4,6,3};


		int Max=Integer.MAX_VALUE;
		int Min=Integer.MIN_VALUE;


		for(int i=0;i<arr.length;i++){
		
			if(Max<arr[i]){
			
			     Max=arr[i];
			
			}
			if(Min>arr[i]){
			
				Min=arr[i];
			}
		
		}

		int MqwinLen=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
		
			if(arr[i]==Min){
			
				for(int j=i+1;j<arr.length;j++){
				
					int len=0;
					if(arr[i]==Max){

						len=j-i+1;
					
						if(len<MinLen){
						
							MinLen=len;
						}
					}
				}
			}else{
			
				if(arr[i]==Max){
				
					for(int j=i+1;j<arr.length;j++){
					
						int len=0;
						if(arr[i]==Min){
						
							len=j-i+1;

							if(len<MinLen){
							
								MinLen=len;
							}
						}
				        }
				}
		     }
		
		}
		System.out.println(MinLen);
	
	}

}
