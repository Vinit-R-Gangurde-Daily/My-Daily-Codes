import java.util.*;
class CricPlayer{

	int jerNO=0;
	String name=null;
	CricPlayer(int jerNO,String name){
	
		this.jerNO=jerNO;
		this.name=name;
	}
                         
   public String toString(){       //in  user define object we have to call the tostring method other wise it will print the address of that object
                                 //but in case of predefine class it will call inter
	   return (jerNO + " " + name);
   
   }

   

}



class ArrayListDemo{

	public static void main(String[] args){
	
	             ArrayList Ar=new ArrayList();
                      
                        Ar.add(new CricPlayer(7,"Dhone"));
			Ar.add(new CricPlayer(18,"Virat"));
			Ar.add(new CricPlayer(45,"Rohit"));

			System.out.println(Ar);
	
	}


}
