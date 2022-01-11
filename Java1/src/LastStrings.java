import java.util.Arrays;

public class LastStrings {

	public static void pigLatin(String s) {
		String[] a=s.split(" ");
		int len;
		for (int i=0; i<a.length; i++) {
			a[i]+=a[i].charAt(0);
			len=a[i].length();
			a[i]=a[i].substring(1, len);
			a[i]+="ay";
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void replace(String a, char b) {
		char[] c=a.toCharArray();
		for (int i=0; i<c.length; i++) {
			if (!(c[i]==b)) continue;
			c[i]='$';
		}
		System.out.println(Arrays.toString(c));
	}
	
	public static void longest(String[] a) {
		int m=a[0].length(), index=0;
		for (int i=1; i<a.length; i++) {
			if(!(a[i].length()>m)) continue;
			m=a[i].length();
			index=i;
		}
		System.out.println(a[index]);
	}
	
	public static void main (String[]args) {
//		pigLatin("pig pig");
//		replace("hello", 'l');
		longest(new String[]{"hi", "hello", "bye"});
	}
}
