


abstract class Parent{


	void Carrer(){
	
		System.out.println("Engineering");
	
	}

      abstract void Marry();

}

class Child extends Parent{


      void Marry(){
      
      
	      System.out.println("Tanishaka");
      
      }	


}
class Client{

	public static void main(String[] args){

	Child obj=new Child();	
	obj.Carrer();
	obj.Marry();
	
	}

}
