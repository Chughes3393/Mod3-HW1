package Lessons;

public class ArraysLesson {

	public static void main(String[] args) {

//		In Java, all arrays are dynamically allocated
//		They are objects that give us access to do things such as finding length
//		To create an array we use [] after the data type 
//		arrays can be used for static fields, local variables and in method parameters
//		Size of the array can be specified w int or short but not long 

//		One-dimensional arrays
//		Declaration
//		two components: type & name

//		int intArray[];
//		int[] intArray; // preferred declaration way

//		Instantiation 
//		Size is fixed and cannot be resized after allocation
//		intArray = new int[20];

//		One-liner all together -- combining both statements
		int[] intArray = new int[20];

//		Adding values to our intArray by index
		intArray[0] = 1;
		intArray[1] = 2;

//		System.out.println(intArray[2]);

//		Array Literals -- when we know the size of the array 
		int[] intArray2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//		Latest versions of Java does not require new int[]
		int[] intArray3 = { 1, 2, 3, 4, 5 };

//		Print all elements using for loop 
		for (int i = 0; i < intArray2.length; i++) {
// System.out.println("Index of " + i + " is " + intArray2[i]);
		}

//		How to print array using toString method
//		System.out.println(Arrays.toString(intArray2));

//		Access using for each
//		type var : array 
//		Don't use for each if you want to modify the array
//		For each is typically used to iterate over collections of ArrayList classes 
		for (int num : intArray3) {

//			System.out.println("For each: " + num);
		}

// Multidimensional arrays
		int[][] intArray4 = new int[10][20]; // 2d Array

		int[][] intArray5 = { { 2, 7, 9 }, { 2, 3, 4 }, { 7, 6, 5 } };
		
//		Printing 2D Array 
		
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j< 3; j++) {
				System.out.print(intArray5[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}







