import java.util.Scanner;
public class MoreLoops {
private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an integer: ");
		int x=in.nextInt();
		// definite finite, linear
		for (int n=-x; n<=x; n++) {
			System.out.println(n);
		}
		System.out.println("enter an integer: ");
		int num1=in.nextInt();
		System.out.println("enter another integer: ");
		int num2=in.nextInt();
		int i = 0;
		//definite finite, linear
		for(int t=1; t<=num1&&t<=num2; t++) {
            if(num1%t==0&&num2%t==0) {
            	i=t;
            }
		}
		System.out.println(i);
		System.out.println("enter an integer: ");
		int num3=in.nextInt();
		System.out.println("enter another integer: ");
		int num4=in.nextInt();
		int i1=0;
		//definite finite, linear
		for (int t=num3*num4; t>0; t--) {
			if (t%num3==0&&t%num4==0){
				i1=t;
			}
		}
		System.out.println(i1);
		System.out.println("enter an integer: ");
		int num5=in.nextInt();
		boolean prime=true;
		//definite finite, linear
		for (int t=2; t<num5; t++) {
			if (num5%t==0) {
				prime=false;
			}
		}
		if (prime==false){
			System.out.println("not a prime");
		}
		else if(num5<=1) {
			System.out.println("not a prime");
		}
		else {
			System.out.println("is a prime");
		}
		System.out.println("enter an integer: ");
		int num6=in.nextInt();
		int f=1;
		//definite finite, linear
		for (int t=1;t<=num6;t++) {
			f=f*t;
		}
		System.out.println(f);
		//indefinite, linear
		String cont="yes";
		while (!cont.equals("no")) {
			System.out.println("do you want to keep playing?");
			cont=in.next();
		}
		System.out.println("game over");
	}		
}
