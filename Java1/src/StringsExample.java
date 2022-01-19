

public class StringsExample {

	
	
	public static void main(String[]args) {
		String str="hello";
//		str+=" world"; 
//		str.length(); //str. method
//		str.charAt(0); //==arr[0];
//		str.substring(1, 5); //1-5 inclusive exclusive (include 1, exclude 5)
//		str=str.substring(0,2)+'k'+str.substring(3); //replace letters in string
		System.out.println(str);
		System.out.println(str.substring(0, str.length()/2));
		System.out.println(str.charAt(2));
	}
}
