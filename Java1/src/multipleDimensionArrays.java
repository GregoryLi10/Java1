import java.util.Arrays;
public class multipleDimensionArrays {
	
	
	
	public static void arr() {
		int[][] a=new int[3][3];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				a[i][j]=i*a[i].length+j+1;
			}
		}
		for (int[] b:a)
			System.out.println(Arrays.toString(b));
	}
	
	public static void main(String[] args) {
		arr();
		
	}
}
