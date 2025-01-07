

//sort the user define objects in arrayList

import java.util.*;
class Employee{

	String EmpName=null;
	float Sal=0;

	Employee(String EmpName,float Sal){
	
		this.EmpName=EmpName;
		this.Sal=Sal;
	
	}

	public String toString(){
	
		return "{" + EmpName + "=" + Sal +"}";
	
	}


}

class SortByName implements Comparator<Employee>{


	public int compare(Employee obj1,Employee obj2){
	
		return obj1.EmpName.compareTo(obj2.EmpName);
	
	} 
	

}

class SortBySal implements Comparator<Employee>{


	public int compare(Employee obj1,Employee obj2){
	
	
		return (int)(obj1.Sal-obj2.Sal);
	
	}


}


class ListSortDemo{

	public static void main(String[] args){
	
		ArrayList ar=new ArrayList();

		ar.add(new Employee("pratik",450000f));
		ar.add(new Employee("Rahul",550000f));
               ar.add(new Employee("Bhushan",850000f));


		System.out.println(ar);

		Collections.sort(ar,new SortByName());

		System.out.println(ar);
		
		Collections.sort(ar,new SortBySal());

		System.out.println(ar);
	
	
	}


}
