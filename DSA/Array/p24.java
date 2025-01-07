


class Demo{

	public static void main(String[] args){
	
		int arr[]=new int[]{2,4,1,3};

                int Prefixarr[]=new int[arr.length];

                    Prefixarr[0]=arr[0];
		
		for(int i=1;i<arr.length;i++){

			Prefixarr[i]=Prefixarr[i-1]+arr[i];
		
		}                            
		for(int i=0;i<arr.length;i++){
	
		
			for(int j=i;j<arr.length;j++){
			int Sum=0;
				if(i==0){
				
					Sum=Prefixarr[j];
				}else{
				Sum=Prefixarr[j]-Prefixarr[i-1];
                           }
			System.out.println(Sum);
			}
			
	
		}
	
	}


}
