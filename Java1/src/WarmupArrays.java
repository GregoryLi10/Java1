import java.util.Arrays;

public class WarmupArrays {
	
	public static void trim (int[] arr) {
		int max=arr[0], min=arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>max)
				max=arr[i];
			if (arr[i]<min)
				min=arr[i];
		}
		int c=0;
		for (int x:arr) {
			if (x!=max&&x!=min)
				c++;
		}
		int[] trim=new int[c];
		for (int i=0, k=0; i<trim.length; i++, k++) {
			if (arr[k]!=max&&arr[k]!=min)
				trim[i]=arr[k];
			else
				i--;
		}
		System.out.println(Arrays.toString(trim));
	}
	
	public static void fibonacci(int n) {
		int[] arr=new int[n];
		arr[0]=0;
		if (n>1) {
			arr[1]=1;
			for (int i=2; i<arr.length; i++) {
				arr[i]=arr[i-1]+arr[i-2];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void div(int[] arr) {
		boolean[] div=new boolean[arr.length];
		if (arr.length>1) {
			for (int i=1; i<arr.length; i++) {
				if (arr[i]%arr[i-1]==0)
					div[i]=true;
			}
		}
		System.out.println(Arrays.toString(div));
	}
	
	public static void avg(int[] arr) {
		double[] avg=new double[arr.length];
		double sum=0;
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
			avg[i]=sum/(i+1);
		}
		System.out.println(Arrays.toString(avg));
	}
	
	public static void main (String[] args) {
//		trim(new int[] {1,1,1,2,3,4,5,6,7,7,7,7});
//		fibonacci(15);
//		div(new int[] {8, 3, 12, 5, 15, 45});
		avg(new int[] {4, 6, 2, 12});
	}
}
