import java.util.Scanner;

public class BooleansFinalIfs {
	
	public void binary(int a, int b, int c, int d, int e) {
	
		if (a==1) {
			a=(int) Math.pow(2, 4);
		}
		if (b==1) {
			b=(int) Math.pow(2, 3);
		}
		if (c==1) {
			c=(int) Math.pow(2, 2);
		}
		if (d==1) {
			d=(int) Math.pow(2, 1);
		}
		if (e==1) {
			e=(int) Math.pow(2, 0);
		}
		if (a==0) {
			a=0;
		}
		if (b==0) {
			b=0;
		}
		if (c==0) {
			c=0;
		}
		if (d==0) {
			d=0;
		}
		if (e==0) {
			e=0;
		}
		System.out.println(a+b+c+d+e);
	}
	
	public void stringSwitch() {
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter a string: ");
		String str1=input1.next();
		System.out.println("enter another string: ");
		String str2=input1.next();
		String str;
		str=str1;
		str1=str2;
		str2=str;
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str);
	}
	
	public void remainder(int x) {
		int d=x/1000;
		int a=x%1000/100;
		int b=x%100/10;
		int c=x%10;
		System.out.print(d%c+", ");
		System.out.print(d%b+", ");
		System.out.println(d%a);
	}
	
	public void charSum(char a, char b) {
		int x = a+b;
		if((x>64&&x<91)||(x>96&&x<123)) {
			System.out.println((char)x);
		}
		else if (x<65) {
			System.out.println((char)'A');
		}
		else if (x<94&&x>90) {
			System.out.println((char)'Z');
		}
		else if (x>93&&x<97) {
			System.out.println((char)'a');
		}
		else {
			System.out.println((char)'z');
		}
	}
		
	public static void main(String[] args) {

			BooleansFinalIfs runner = new BooleansFinalIfs();

			runner.binary(1,0,1,1,1);
			runner.stringSwitch();
			runner.remainder(34924);
			runner.charSum((char)65,(char)34);
			
	}
}
