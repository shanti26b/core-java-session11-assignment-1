/*here i want to display the exception which occurs if we take array size out of the index size
 * its shows the output as array index out of bound exception
*/

package assignment11;


public class ArrayException { //here i am taking class name as ArrayExcetption

	
		public static void main(String [] args) { // taking the main method
		 	
	 		int array[] = new int [5]; //here I'm creating an array  size of index  five 
	 		
	 
	 		array[0] =20; // in  index array of size 0 we are taking element 20
	 		array[1] =30; // in index array of size 1 we are taking element 30
	 		array[2] =40; // in index array of size 2 we are taking element 40
	 		array[3] =50; // in index array of size 3 we are taking element 50
	 		array[4] =60; // in index array of size 4 we are taking element 60
	 		
	 		System.out.println( array[5]=90); //here i am trying to print the size of the 6th element which i have not declared
	 		                                  //this exception are known as unchecked exception
		}                                     //so it shows an exception here where array index out of bound

	

	}


