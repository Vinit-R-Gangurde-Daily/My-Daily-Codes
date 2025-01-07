

class Demo{

	public static void main(String[] args){
	
	
		int a=10;
		int b=10;            //all the data is same and java support integer cache(auto boxing)due to this only one object of 10 will be for
		Integer c=10;          //and all variable will be see toworde this object (pove=identityHashCode of all three are same)
	
		
		System.out.println(System.identityHashCode(a));
	        System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));

	}



}
