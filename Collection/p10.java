

/*
  
   3)
   -Enumeration  is only work on vector stack 
   -it move in one diration only
 */
import java.util.*;
class EnumeratDemo{

	public static void main(String[] args){
	
	 
                Stack st=new Stack();

                      st.add("Rohit");
                      st.add(23);
                     st.add(23.4f);
                      st.add(33);
		 
	       Enumeration Enu=st.elements();

	       while(Enu.hasMoreElements()){
	       
	           System.out.println(Enu.nextElement()); 
	       
	       }
	
	
	}



}
