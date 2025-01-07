/*
 
 IMP POINT(MOST FREQUENT ENTERVEW QUACTION)

 Hidden This Reference

 
 */


class Demo{

	int x=10;

	Demo(){      //we see that Demo is no arrgument constracter but internaly it have a hiddern parameter called as this pointer
		     //Demo(Demo this) here Demo is datatype and this is name of variable (predefine)
	
	
		System.out.println(this.x); //here we can prove this is present other wise this will be give the error
		System.out.println("in constructor");

	
	}
	public static void main(String[] args){
	

		Demo obj=new Demo();  //when we create the object constructor will be call implicity 
				      //for this internaly command goes like Demo(obj) here obj contain the address of object
	
	}

}
