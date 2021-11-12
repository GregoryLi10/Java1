import java.util.Scanner;
import java.util.Arrays;
public class StartingArrays {
	
	static Scanner in=new Scanner(System.in);
	
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
	
	public static void userArray(int x) {
		int[]userArr=new int[x];
		System.out.println("input "+x+" numbers");
		for (int i=0; i<x; i++) {
			int n=in.nextInt();
			userArr[i]=n;
		}
		System.out.println(Arrays.toString(userArr));
	}
	
	public static void reverse(int[] arr) {
		 int x, n=arr.length;
        for (int i=0; i<n/2; i++) {
            x=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=x;
        }
            System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[]args) {
		int[]myArr=oneToN(10);
		display(myArr); 
		swap(myArr);
		display(myArr);
		userArray(3);
		reverse(myArr);
	}
}
