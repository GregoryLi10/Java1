package arrays;

import java.util.Arrays;

public class More2DArrays {
	public static void fill(int n, int m) {
		int[][] a=new int[n][m];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=i*a[i].length+j+1;
			}
		}
		for (int[] b:a)
			System.out.println(Arrays.toString(b));
	}
	
	public static void max(double[][] a) {
		double max=a[0][0];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j]>max) max=a[i][j];
			}
		}
		System.out.println(max);
	}
	
	public static void avg(double[][] a) {
		int c=0;
		double sum=0;
		for (int i=0; i<a.length; i++){
			for (int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
				c++;
			}
		}
		System.out.println(sum/c);
	}
	
	public static void flatten(int[][] a) {
		int[] b=new int[a.length];
		for (int i=0; i<b.length; i++) {
			int s=0;
			for (int j=0; j<a[i].length; j++) {
				s+=a[i][j];
			}
			b[i]=s;
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static boolean magic(int[][] a) {
		int len=a[0].length, sum=0, prev=a[0][0], sum2=0;
		if (len!=a.length)return false;
		for (int i=1; i<a.length; i++) {
			if (a[i].length!=len)return false;
			prev+=a[0][i];
		}
		
		for (int i=0; i<a.length; i++) {
			sum+=a[i][i];
			sum2+=a[i][a.length-1-i];
		}
		if (!(sum==prev&&sum2==prev))return false;
		
		
		for (int i=1; i<a.length; i++) {
			sum=0; sum2=0;
			for (int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
				sum2+=a[j][i];
			}
			if (!(sum==prev&&sum2==prev))return false;
		}

		return true;
	}
	
	public static String sumBox(int[][] a) {
		int t=0, max=0, xi=0, yi=0, sum=0; 
		for (int i=0; i<a.length-2; i++) {
			for (int j=0; j<a[i].length; j++) {
				t=0;
				for (int c=0; c<3; c++) {
					if (j+2<a[i+c].length) t++;
				}
				if (t!=3) {continue;}
				sum=0;
				for (int n=i; n<i+3; n++) {
					for (int m=j; m<j+3; m++) {
						sum+=a[n][m];
					}
				}
				if (sum>max) {
					max=sum;
					xi=i;
					yi=j;
				}
			}
		}
		return max+" "+a[xi][yi];
	}
	
	public static void main(String[] args) {
		fill(5, 3);
		max(new double[][] {
			{1,2,3},
			{4,5,6}
		});
		avg(new double[][]{
			{1,2,3},
			{4,5,6}
		});
		flatten(new int[][]{
			{1,2,3},
			{4,5,6}
		});
		System.out.println(magic(new int[][] {
			{10,3,13,8},
			{5,16,2,11},
			{4,9,7,14},
			{15,6,12,1}
		}));
		
		System.out.println(sumBox(new int[][] {
			{1,2,3,4,5},
			{1,2,3,4},
			{1,2,3,4,5},
		}));
		
	}
}
