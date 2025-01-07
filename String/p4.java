




class StringDemo{

	public static void main(String[] srgs){
	
	
	
		String str1="Shashi";
		String str2="Bagal";

		System.out.println(str1+str2);  //ShashiBagal


		String str3="ShashiBagal"; //hashcode of str3 & str4 is not same even the data is same
		String str4=str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	
	
	}


}
