



class Demo{


        public static void main(String[] args){

                int arr1[]={1,2,3,5};
                int arr2[]=new int[]{2,1,9,8};

                System.out.println("uncommon element is = ");
               
		
		for(int i=0;i<arr1.length;i++){

			int count=0;
                        for(int j=0;j<arr2.length;j++){

                                if(arr1[i]==arr2[j]){

                                       count++;

                                }

                        }
  
			if(count==0){
			
		     System.out.println(arr1[i]);
			
			}

			
                }

		for(int i=0;i<arr2.length;i++){

                        int count=0;
                        for(int j=0;j<arr1.length;j++){

                                if(arr2[i]==arr1[j]){

                                       count++;

                                }

                        }

                        if(count==0){

                     System.out.println(arr2[i]);

                        }


                }


        }


}
