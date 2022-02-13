
public class IfStatements {
	
	public void positiveNegative(int x) {
		if (x>0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	public void oddEven(int x) {
		if (x%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
	
	public void charCase(char x) {
		int c = (int)x;
		if (x>64 && x<91) {
			System.out.println("uppercase");
		}
		else if (x>96 && x<123){
			System.out.println("lowercase");
		}
		else {
			System.out.println("neither");
		}
	}
	
	public void multiple10(int x) {
		if (x%10==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

	public void max(double a, double b, double c) {
		if (a>b && a>c) {
			System.out.println(a);
		}
		else if (b>a && b>c){
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
	
	public void wholeNumber(double x) {
		if (x%1==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	public static void main(String[] args) {

			IfStatements runner = new IfStatements();

			runner.positiveNegative(5);
			runner.oddEven(5);
			runner.charCase('5');
			runner.multiple10(50);
			runner.max(10.2, 10.3, 10.1);
			runner.wholeNumber(2.5);
	}
}