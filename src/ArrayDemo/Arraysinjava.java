package ArrayDemo;

/* What is Array, How to create Array, How to retrieve values from array , 2D array, Limitation of array
 * 
 * Array is a collection of similar data type
 * syntax : datatype arrayname[]= new datatype[size];
 * 
 * limitations of array are type and size
 */

public class Arraysinjava {
	
	public static void main(String[] args)
	{
		int student_id[]= new int[5];
		
		student_id[0] = 60;
		student_id[1] = 60;
		student_id[2] = 70;
		student_id[3] = 80;
		student_id[4] = 90;
		
		System.out.println(" Length of Array  " + student_id.length);
	}

}
