package arrays;

import java.util.Arrays;

public class FinalArrays {

	public static void indexSum(double[] arr) {
		double sum=0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i]*i;
		}
		System.out.println(sum);
	}
	
	public static void toString(char[] arr) {
		String str="";
		for (char x: arr) {
			if (x>96&&x<123)
				str+=x;
		}
		System.out.println(str);
	}
	
	public static void adjacent(int[] arr, int n) {
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i]+arr[i+1]==n) {
				System.out.println("yes"); 
				break;
			}
		}
	}
	
	public static void most(char[] arr) {
		Arrays.sort(arr);
		int c=0, m=0;
		char k=arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]==arr[i-1]) {
				c++;
				if (c>m){
					m=c;
					k=arr[i];
				}
			}
		}
		System.out.println(k);
	}
	
	public static void anagram(int[] a, int[] b) {
		int c=0;
		if (a.length==b.length) {
			for (int x:a) {
				for (int y:b) {
					if (x==y)
						c++;
				}
			}
			System.out.println(c==a.length);
		}
		else 
			System.out.println("false");
	}
	
	public static void main(String[]args) {
		indexSum(new double[] {5.8, 3.1, 2.5});
		toString(new char[] {'h', 'i', '!', 'H', 'e', 'l', 'L', 'o', '?'});
		adjacent(new int[] {1,5,2,7,3}, 9);
		most(new char[] {'h', 'k', 'h', 'u', 'b', 'e', 'k', 'u', 'u'});
		anagram(new int[]{1,2,3}, new int[] {3,2,4});
	}
}
