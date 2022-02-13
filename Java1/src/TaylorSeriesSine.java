import java.util.Scanner;
public class TaylorSeriesSine {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter x: ");
		int degree=input1.nextInt();
		double x=degree*Math.PI/180;
//		System.out.println(Math.sin(x));
//		sin(x)=x^1/1!-x^3/3!+x^5/5!...
		int n=1;
		int f=1;
		int n1=1;
		double sinx=0;
		double term=0;
		for (int i=1; i<=20; i++) {
			for(n=1; n<=n1; n++) {
				f=f*n1;
			}
			term=Math.pow(x, n1)/f;	
			if (i%2==0){
				sinx-=term;
			}
			else {
				sinx+=term;
			}
			n1+=2;
			
		}
		System.out.println(sinx);
		
//		System.out.println(f);
//		Scanner input1 = new Scanner(System.in);
//		System.out.println("enter x: ");
//		int x=input1.nextInt();
//		int n=15;
//		double i=x*Math.PI/180;
////		System.out.println(Math.sin(x));
////		sin(x)=x^1/1!-x^3/3!+x^5/5!...
//		int f=1;
//		int t=1;
//		double sinx=0.0;
//		while (n>=1) {
//			double y=0.0;
//			if (x%2==0) {
//				y=-Math.pow(i, t)/f(t);	
//			}
//			if(x%2==1) {
//				y=Math.pow(i, t)/f(t);	
//			}
//			sinx+=y;
//			n++;
//			t+=2;
//		}
//		System.out.println(sinx);
	}
	
}
