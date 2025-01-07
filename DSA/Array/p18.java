


class Demo{

	public static void main(String[] args){
	
	       char arr[]=new char[]{'a','b','e','g','a','g'}; 
	       int N=6;
                  int count=0;
		  int pair=0;
	       for(int i=0;i<N;i++){
	       
		       
		       if(arr[i]=='a'){
		       
                              count++;      
		       
		       
		       }else if(arr[i]=='g'){
		          
			       pair=pair+count;
		       
		       }
	       
	       
	       }
	       System.out.println(pair);
	
	}

}
