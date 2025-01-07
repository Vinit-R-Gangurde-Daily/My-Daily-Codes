

import java.util.*;
class Demo{

	String name=null;
	int num=0;

	Demo(String name,int num){
	
		this.name=name;
		this.num=num;
	}

	public String toString(){
	
		return "{" + name + ":" + num +"}";
	
	}

}

class ArrayListDemo{

	public static void main(String[] args){
	
	
		ArrayList obj=new ArrayList();

			obj.add(new Demo("Rahul",34));
	                obj.add(new Demo("Pratik",14));
			obj.add(new Demo("Rohit",14));
			obj.add(new Demo("uday",94));
	
	
			System.out.println(obj);

			Collections.sort(obj,(obj1,obj2))->{
			
			
				return ((Demo)obj1).name.compateTo(((Demo)obj2).name);
			
			};

			System.out.println(obj);

	
	}


}
