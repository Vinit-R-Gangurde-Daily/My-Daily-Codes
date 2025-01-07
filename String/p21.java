/*
 
   in this program we will right our own program for count the num of element in the string same as length()
   predefine method
 
 
 */

class Demo{

	
	static int Mylenfun(String str1){

		char arr[]=str1.toCharArray();
		int count=0;

		for(int i=0;i<arr.length;i++){
		
		
			count++;
		
		}
	 return count;
	
	
	}
	
	public static void main(String[] args){
	
		String str="vinit";

		System.out.println("by using predefine fun length");
		
		System.out.println(str.length());
	

		System.out.println("by using our own Mylenfun");

		int len=Mylenfun(str);

		System.out.println(len);
	}

}
