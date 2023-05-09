package phase1;

public class array{
	 public static void main(String[] args) {

		   int[] a = {2, -9, 0, 8, 12};
		   for(int i=0;i<5;i++) {
			   System.out.println("Elements of array a: "+a[i]);
			   }
                              //multidimensional array
			   int[][] b ={{2, 4, 6, 8}, 
			               {3, 6, 9} };
			         
			         System.out.println("\nLength of row 1: " + b[0].length);

 int sum = 0;
		   Double average;
		   
		   // access all elements using for each loop
		   // add each element in sum
		   for (int list: a) {
		     sum += list;
		   }
		  
		   // get the total number of elements
		   int arrayLength = a.length;

		   // calculate the average
		   // convert the average from int to double
		   average =  ((double)sum / (double)arrayLength);

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
		 }
		}

