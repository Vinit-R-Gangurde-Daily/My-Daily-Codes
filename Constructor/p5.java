/*
     In theis Scenario we will create two differet class one as MCDonal & one as Costamer 
     but in MCDonal we do not write the main method we write the main method in Costamer
     due to this we have to pass the second .class(Costamer) file jvm of exuction of the program

        in this program we are tring to access the method of first class  in second class by crating the object of first class
 
 
 */


class MCDonal{

	int items=5;
	String fames="fries";

	void fun(){
	
	        String str2="veg mill";
		String str3="non-veg mill";

		System.out.println("num of item you order= "+items);
		System.out.println("trading food you order= "+fames);
	
	
	}



}



class Costamer{

	public static void main(String[] args){
	
		MCDonal obj=new MCDonal();

		obj.fun();
	
	}



}














