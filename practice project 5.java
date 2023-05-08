package phase1;
import java.util.*;

public class collectors {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> list=new ArrayList<String>();   
	      list.add("super");//
	      list.add("happy");    	   
	      System.out.println(list);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> ll=new LinkedList<String>();  
	      ll.add(" yamuna");  
	      ll.add("krishna");  	      
	      Iterator<String> itr=ll.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(75);  
	       set.add(87);  
	       set.add(95);
	       set.add(100);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(78);  
	       set2.add(48);  
	       set2.add(22);
	       set2.add(16);	       
	       System.out.println(set2);
	      	} 
	      }  
	}



