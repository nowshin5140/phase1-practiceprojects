package phase1;
import java.util.*;
public class maps{

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"first");    
	      hm.put(2,"second");    
	      hm.put(3,"third");   
	       
	      System.out.println("\nThe elements of Hashmap are " +hm);  
	      
	      
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"kaif");  
	      ht.put(5,"in");  
	      ht.put(6,"first");  
	      ht.put(7,"class");  

	      System.out.println("\nThe elements of HashTable are " +ht);  
	     
	      
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> tr=new TreeMap<Integer,String>();    
	      tr.put(8,"ankit");    
	      tr.put(9,"krishna");    
	      tr.put(10,"ganesh");       
	      
	      System.out.println("\nThe elements of TreeMap are " +tr);  
	         
	         
	      
	   }  
}




