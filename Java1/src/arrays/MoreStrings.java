package arrays;

import java.util.Arrays;

public class MoreStrings {
	
	public static void firstLast(String s) {
		System.out.println(s.substring(0, 2).equals(s.substring(s.length()-2, s.length())));
	}
	
	public static void check(String s1, String s2) {
		for (int i=0; i<s2.length(); i++) 
			System.out.print(s1.contains(s1.substring(i,i+1))+" ");
		System.out.println();
	}
	
	public static void wordcount(String s) {
		System.out.println(s.split(" ").length);
	}
	
	public static void toArray(String s) {
		String[] c=s.split(" ");
		System.out.println(Arrays.toString(c));
	}
	
	public static void rushE(String s) {
		for (String a:s.split("e"))
			System.out.print(a);
		System.out.println();
	}
	
	public static void palindrome(String s) {
		for (int i=0; i<s.length()/2; i++) {
			if (!(s.charAt(i)==(s.charAt(s.length()-i-1)))) {
				System.out.println("no");return;
			}
		}
		System.out.println("yes");
	}
	
	
	public static void main(String[]args) {
		firstLast("edited");
		check("Hello world", "leg");
		wordcount("I love you");
		toArray("AP CS is for nerds");
		rushE("let's eat there");
		palindrome("asdffdsa");
	}
}
