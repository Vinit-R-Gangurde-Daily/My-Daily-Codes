/*
 
   when we 
 
 */ 

abstract class Parent{

	void Carrer(){
	
		System.out.println("Doctor");
	
	}

	abstract void Marry();

}


class Client{

	public static void main(String[] args){
	
		Parent obj=new Parent();
		obj.Carrer();
	
	}


}
