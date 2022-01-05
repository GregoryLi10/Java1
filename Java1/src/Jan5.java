import java.util.Arrays;

public class Jan5 {
	public static boolean order(String s) {
		s.toLowerCase();
		for (int i=1; i<s.length(); i++) {
			if (s.charAt(i)<s.charAt(i-1)) 
				return false;
		}
		return true;
	}
	
	public static String grade(String[]s, int[] a) {
		int m=a[0], index=0;
		for (int i=1; i<s.length; i++) {
			if (a[i]>m) {
				m=a[i];
				index=i;
			}
		}
		return s[index];
	}
	
	public static int[] oddSquares(int n) {
		int[] a=new int[n];
		for (int i=0, j=1; i<a.length; i++, j+=2) {
			a[i]=(int) Math.pow(j, 2);
		}
		return a;
	}
	
	public static String three(String s1) {
		String s2="";
		for (int i=3; i<=s1.length(); i+=3) {
			if (i%2!=0) {
				s2+=s1.substring(i-3, i);
			}
		}
		if (s1.length()%6<3){
			s2+=s1.substring(s1.length()-s1.length()%3,s1.length());
		}
		return s2;
	}
	
	public static int[] factor(int n) {
		if (n==0) return new int[]{0};
		int[] a=new int[n];
		a[0]=1;
		int q=1;
		for (int i=1; i<a.length; i++) {
			for (int j=q+1; j<=n; j++) {
				if (n%j==0) {
					a[i]=j;
					q=j;
					break;
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(order("ngeo"));
		System.out.println(grade(new String[] {"a", "b", "c"}, new int[] {3,2,1}));
		System.out.println(Arrays.toString(oddSquares(5)));
		System.out.println(three("abcdefghijklm"));
		System.out.println(Arrays.toString(factor(10)));
	}
}
