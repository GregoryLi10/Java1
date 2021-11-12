import java.util.Arrays;

public class TeamArrays {
	
	public static double average(int[] arr) {
		double sum=0;
		for (int a:arr) {
			sum+=a;
		}
		return sum/arr.length;
	}
	
	public static char[] merge(char[] a, char[]b) {
		char[] arr=new char [a.length+b.length];
		for (int i=0;i<a.length;i++) {
			arr[i]=a[i];
		}
		for (int i=0;i<b.length;i++) {
			arr[i+a.length]=b[i];
		}
		return arr;
	}
	
	public static void main(String[]args) {
		int[]myArr={1, 2, 3, 4, 5};
		average(myArr);
		char[]a= {'b'};
		char[]b= {'c','d','e'};
		merge(a, b);
	}
}
