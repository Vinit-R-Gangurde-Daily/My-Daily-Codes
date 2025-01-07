

class Demo{

                                                 
	int a=20;
	String str="vinit";

          static String str2="Gangurde";

	void info(){
	
		System.out.println(a);
		System.out.println(str);
		System.out.println(str2);
	
	}

}


class MainDemo{

	public static void main(String[] args){
	
	Demo obj1=new Demo();
	Demo obj2=new Demo();

	obj1.info();
	obj2.info();
                                       //here we create two objects as obj1 & obj2 
				       //and using the help of obj2 i will change the value of a ,str & str2 
	System.out.println("--------------------");
				       //do not visible to obj1 but in the case of str2 it is static due to this what ever the chages taken by
	obj2.a=30;                     //obj2 is visible to obj1
  	obj2.str="uday";               
        Demo.str2="Rajput";	// we can call static variable with the help of class name & object name also
				// refer digram for better aunderstanding
	
	obj1.info();
	obj2.info();
	
	
	}




}
