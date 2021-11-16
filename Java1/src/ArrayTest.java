import java.util.Arrays;

public class ArrayTest {

	public static int[] createArray(int n) {
		int[] newArr= new int[n];
		return newArr;
	}
	
	public static void display(int[] arr) { //method to display entire array
		for (int n=0; n<arr.length; n++) {
			System.out.print(arr[n]+", ");
		}
	}
	
	
	public static void main(String[] args) {
//		int[] arr1= {5, 4, 8, 3}; //useful for testing but not practical
//		String[] arr2= new String[6]; //practical
//		arr1[3]=5;
//		System.out.println(arr1[arr1.length-1]); //last thing in array
//		display(arr1); //runs method
//		System.out.println(Arrays.toString(arr1)); //built in function to print arrays
//		
//		
//		int[]myArr=createArray(10); //creates array with 10 things
//		display(myArr); //displays array
		
//		int[]arr3={1,54,2,7};
//		for (int num:arr3) { //for each loop
//			System.out.print(num+" "); //prints each number in the array, only access, not modify
//		}
		
		
	}
	
}
