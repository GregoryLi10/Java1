import java.util.Scanner;
public class StartingArrays {
	
	Scanner input=new Scanner(System.in);
	
	public static void display(int[] arr) { //method to display entire array
		for (int n=0; n<arr.length; n++) {
			System.out.print(arr[n]+", ");
		}
		System.out.println();
	}
	
	public static int[] oneToN(int n) {
		int[] newArr=new int[n];
		for (int i=1; i<=n; i++) {
			newArr[i-1]=i;
		}
		return newArr;
	}
	
	public static void swap(int[] arr) {
		int n=arr[arr.length-1];
		int i=arr[0];
		arr[arr.length-1]=i;
		arr[0]=n;
	}
	
	public void userArray() {
		
	}
	
	public static void main(String[]args) {
		int[]myArr=oneToN(10);
		display(myArr); 
		swap(myArr);
		display(myArr);
		int[]myArr1=oneToN(10);
	}
}
