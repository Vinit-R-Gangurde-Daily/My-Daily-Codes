



class Outer{

	Outer(){
	
		System.out.println(this);
	
	}

	class Inner{
	
		Inner(){
		
			System.out.println(Outer this);
			System.out.println(this);
		
		}
	
	} 



}


class Client{

	public static void main(String[] args){
	

	     Outer obj=new Outer();
                   System.out.println(obj);

               Outer.Inner obj1=obj.new Inner();
	
	        System.out.println(obj1);
	
	}


}
