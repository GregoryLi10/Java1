import java.util.Arrays;

public class evenMore2DArrays {

	public static int[][] triangle(int n) {
		int[][]a=new int [n][];
		int c=1;
		for (int i=0; i<a.length; i++) {
			a[i]=new int[i+1];
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=c; c++;
			}
			System.out.println(Arrays.toString(a[i]));
		}
		return a;
	}
	
	public static double[][] reverse(double[][] a){
		double t=0;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length/2; j++) {
				t=a[i][j];
				a[i][j]=a[i][a[i].length-j-1];
				a[i][a[i].length-j-1]=t;
			}
			System.out.println(Arrays.toString(a[i]));
		}
		return a;
	}
	
	public static double[] sum(double[][] a) {
		int max=0;
		for (int i=0; i<a.length; i++) {
			if (a[i].length>max) max=a[i].length; //max=a[i].length>max ? a[i].length : max;
		}
		double[] b=new double[max];
		for (int i=0; i<max; i++) {
			for (int j=0; j<a.length; j++) {
				if (i<a[j].length)
					b[i]+=a[j][i];
			}
		}
		System.out.println(Arrays.toString(b));
		return b;
	}
	
	public static int[][] sort(int[][] a){
		for (int i=0; i<a.length-1; i++) {
			for (int j=0; j<a[i].length; j++) {
				for (int k=0; k<a[i+1].length; k++) {
					if (a[i][j]>a[i+1][k]) {
						int t=a[i][j];
						a[i][j]=a[i+1][k];
						a[i+1][k]=t;
					}
				}
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				for (int k=0; k<a[i].length; k++) {
					if (a[i][k]>a[i][j]) {
						int t=a[i][j];
						a[i][j]=a[i][k];
						a[i][k]=t;
					}
				}
			}
		}
		
		for (int[] b:a) {
			System.out.println(Arrays.toString(b));
		}
		
		return a;
	}
	
	public static int[][] snakesort(int[][] a){
		for (int i=0; i<a.length-1; i++) {
			for (int j=0; j<a[i].length; j++) {
				for (int k=0; k<a[i+1].length; k++) {
					if (a[i][j]>a[i+1][k]) {
						int t=a[i][j];
						a[i][j]=a[i+1][k];
						a[i+1][k]=t;
					}
				}
			}
		}
		
		for (int i=0; i<a.length; i++) {
			if (i%2!=1) {
				for (int j=0; j<a[i].length; j++) {
					for (int k=0; k<a[i].length; k++) {
						if (a[i][k]>a[i][j]) {
							int t=a[i][j];
							a[i][j]=a[i][k];
							a[i][k]=t;
						}
					}
				}
			}
			else {
				for (int j=a[i].length-1; j>=0; j--) {
					for (int k=a[i].length-1; k>=0; k--) {
						if (a[i][k]>a[i][j]) {
							int t=a[i][j];
							a[i][j]=a[i][k];
							a[i][k]=t;
						}
					}
				}
			}
		}
		
		for (int[] b:a) {
			System.out.println(Arrays.toString(b));
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		triangle(5);
		reverse(new double[][]{
			{1,2,3,4,5},
			{6,7,8,9,10}
		});
		sum(new double[][]{
			{1,2,3},
			{6}
		});
		sort(new int[][]{
			{5,4,2,1,5},
			{2,1,4,5,6,7,8,10}
		});
		snakesort(new int[][]{
			{5,4,2,1,5},
			{2,1,4,5,6,7,8,10}
		});
	}
}
