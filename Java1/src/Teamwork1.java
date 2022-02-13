import java.util.Scanner;
public class Teamwork1 {
	private static Scanner in = new Scanner(System.in);
	public void power(double x, int n) {
		for(int i=1;n>=i;i++) {
			System.out.println(Math.pow(x, i));
		}
	}
	
	public void sum(int n) {
		int sum=1;
		for(int i=2; i<=n; i++){
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void avg() {
		int sum=0, x=0, t=-1;
		while (x!=-1) {
			sum+=x;
			System.out.println("enter an integer: ");
			x=in.nextInt();
			t++;
		}
		System.out.println((double)sum/t);
	}
	
	public void reverse(int num) {
		int rev=0;  
		while(num!=0){  
			int r=num%10;  
			rev=rev*10+r;  
			num=num/10;  
		}  
		System.out.println(rev);
	}
	
	public void decode(int x) {
		while(x>0){  
			int r=x%100;
			System.out.println(r);
		}  
	}

	
	public static void main(String[]args) {
		Teamwork1 runner = new Teamwork1();
		runner.power(2, 2);
		runner.sum(1);
		runner.avg();
		runner.reverse(12345);
		runner.decode(1234);
	}
	
}
