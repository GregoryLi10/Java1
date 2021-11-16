import java.util.Arrays;

public class MoreArrayPractice {

	public static void common(int[] a, int[] b) {
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<b.length; j++) {
				if (a[i]==b[j])
					System.out.print(a[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void unique(int[]arr) {
		for (int i=0; i<arr.length; i++) {
			boolean dup=false;
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j]==arr[i]) 
					dup=true;
			}
			if (!dup)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void toArr(int n) {
		int[] arr=new int [String.valueOf(n).length()];
		for (int i=0; i<arr.length; i++) {
			arr[arr.length-i-1]=n%10;
			n/=10;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void noDup(int[]arr) {
		int c=arr.length;
		for (int i=0; i<c; i++) {
			for (int j=i+1; j<c; j++) {
				if (arr[j]==arr[i]) { 
					arr[j]=arr[c-1];
					c--;
					j--;
				}
			}		
		}
		
		int[] newArr=new int [c];
		for (int i=0; i<c; i++) {
			newArr[i]=arr[i];
		}
		System.out.println(Arrays.toString(newArr));
	}
	
	public static void main(String[]args) {
		common(new int[] {4,1,7,3,4}, new int[] {8,2,3,4});
		unique(new int[] {6, 6, 3, 9, 4, 3, 2});
		toArr(123456);
		noDup(new int[] {1,2,2,2,3});
	}
}
