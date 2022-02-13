
public class MoreNestedLoops {

	public void box(int n) {
		int t1;
		for (int t=1;t<=5; t++){
			for (t1=t;t1<=5;t1++) {
				System.out.print(t1);
			}
			for (t1=1;t1<=t-1;t1++){
				System.out.print(t1);
			}
			System.out.println();
		}
	}
	
	public void xTriangle(int n) {
		for (int t=1; t<=n; t++) {
			for (int t1=1; t1<=t; t1++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
	
	public void powerX(int x, int y) {
		int p=0, t;
		for (t=0;p<y;t++) {
			p=(int) (Math.pow(x, t));
		}
		System.out.println(t-1);
	}
	
	public void diamond(int x) {
		int c=x-1;
		for (int t=0; t<x;t++) {
			 for (int t1=0; t1<c; t1++) {
				 System.out.print(" ");
			 }
			 for (int t2=0; t2<=t;t2++) {
				 System.out.print("* ");
			 }
			 System.out.println();
			 c--;
		}
		c=0;
		for(int t=x-1;t>0;t--) {
			System.out.print(" ");
			for(int t1=0;t1<c;t1++) {
				System.out.print(" ");
			}
			for(int t2=0;t2<t;t2++) {
				System.out.print("*");
			}
			System.out.println();
			c++;
		}
	}
	
	public static void main(String[]args) {
		MoreNestedLoops runner=new MoreNestedLoops();
		runner.box(5);
		runner.xTriangle(5);
		runner.powerX(9, 9);
		runner.diamond(5);
	}

	
}
