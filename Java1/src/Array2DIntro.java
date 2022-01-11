import java.util.Arrays;

public class Array2DIntro {
	/*
	arr1[0][0]; empty array               
	B. arr1[2][1]; 2 by 1 array              
	C. arr1[1][2]; 1 by 2 array               
	D. arr1[0][2]; empty array
    E. arr2[0][1]; empty array            
    F. arr2[2][1]; 2 by 1 array         
    G. (int)(arr2[0][0] + arr1[1][1]); error 
	H. (char)(arr2[1][1] + arr1[2][0]); error                  
	I. arr1[1]; 1 row with null
	*/
    
	public static void nxn(int n) {
		int[][] a=new int[n][n];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=i*a[i].length+j;
			}
		}
		for (int[] b:a)
			System.out.println(Arrays.toString(b));
	}
	
	public static void length(int[][] a) {
		System.out.println(a[0].length);
		System.out.println(a.length);
	}
	
	public static void fill (int a, int b, int c, int d, int e, int f) {
		int[][] arr= {{a}, {b,c},{d,e,f}};
		for (int[] arr1: arr)
			System.out.println(Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		nxn(5);
		length(new int[][] {
			{1, 2, 3},
			{3, 2, 1},
			{1, 2, 3},
			{3, 2, 1}
		});
		fill(1,2,3,4,5,6);
	}
}
