
public class StringsIntro {

	public static void half(String str) {
		System.out.println(str.substring(str.length()/2));
	}
	
	public static void connect(String str1, String str2) {
		str1=str1.substring(1);
		str1+=str2.substring(1);
		System.out.println(str1);
	}
	
	public static void adverb(String str) {
		if (str.substring(str.length()-2).equals("ly"))
			System.out.println("yes");
		else
			System.out.println("no");
	}
	
	public static void contain(String str1, String str2) {
		for (int i=0; i<=str1.length()-str2.length(); i++) {
			if (str1.substring(i,i+str2.length()).equals(str2)) {
				System.out.println("yes");
				return;
			}
		}
		System.out.println("no");
	}
	
	public static void invert(String str) {
		for (int i=str.length()-1;i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	public static void grid(String str) {
		for (int i=0; i<str.length(); i++) {
			System.out.println(str);
			str=str.substring(1)+str.charAt(0);
		}
	}
	
	public static void main(String[] args) {
		half("hi there");
		connect("hello", "there");
		adverb("happily");
		contain("hippo", "hi");
		invert("hello");
		grid("hello");
	}
}
