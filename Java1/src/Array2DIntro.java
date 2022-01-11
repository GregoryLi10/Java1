import java.util.Arrays;

public class Array2DIntro {
	/*
	A. arr1[0][0]; 6           
	B. arr1[2][1]; 1   
	C. arr1[1][2]; error             
	D. arr1[0][2]; 3
    E. arr2[0][1]; k            
    F. arr2[2][1]; error     
    G. (int)(arr2[0][0] + arr1[1][1]); 105 
	H. (char)(arr2[1][1] + arr1[2][0]); k                  
	I. arr1[1]; 6, 8, 3, 4
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
