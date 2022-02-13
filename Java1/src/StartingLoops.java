

import java.util.Scanner;


public class StartingLoops {

	public static void main(String[] args) {
		//definite finite
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter an integer: ");
		int x=input1.nextInt();
		System.out.println("enter another integer: ");
		int y=input1.nextInt();
		if (x>y){
			while (x+1>y) {
				System.out.println(y);
				y+=1;
			}
		}
		if (y>x) {
			while (y+1>x) {
				System.out.println(x);
				x+=1;
			}
		}
		else {
			System.out.println(x);
		}
		
		//definite finite
		double abx;
		int c=0;
		Scanner input2 = new Scanner(System.in);
		System.out.println("enter a double: ");
		double b=input2.nextInt();
		System.out.println("enter another double: ");
		double a=input2.nextInt();
		while (c<6) {
			abx=b*(Math.pow(a, c));
			System.out.println(abx);
			c+=1;
		}
		//definite finite
		Scanner input3 = new Scanner(System.in);
		System.out.println("enter an integer: ");
		int sqrt1=input3.nextInt();
		int sqrtResult=0;
		int sqrtTest=0;
		while (sqrtTest>-1) {
			sqrtResult=(int) Math.pow(sqrtTest, 2);
			if (sqrtResult==sqrt1){
				System.out.println(sqrtTest);
				break;
			}
			sqrtTest+=1;
		}
		if (sqrtResult!=sqrt1){
			System.out.println("does not have a root");
		}
		//definite finite
		int n2=0;
		int t=0;
		Scanner input4 = new Scanner(System.in);
		System.out.println("enter an integer: ");
		int n=input4.nextInt();
		System.out.println("enter "+n+" integers: ");
		
		while (n>t) {
			int n1=input4.nextInt();
			if (n1>n2) {
				n2=n1;
			}
			t+=1;	
		}
		System.out.println(n2);
	}
	
	
}
