
/*
     Static Inner inner class

 */

class Outer{

	void m1(){
	
		System.out.println("in outer m1");
	
	}

    static class Inner{
	
		void m3(){
		
			System.out.println("in inner m3");
		}
	
	}

	void m2(){
	
		System.out.println("in outer m2");
	}

}


class Inner{

	public static void main(String[] args){
	
		//Outer obj=new Outer();
                    

		Outer.Inner obj1=new Outer.Inner();


	}

}
