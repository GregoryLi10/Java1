
public class TuesdayWarmUp {

	public void digits(int n) {
		while (n>0) {
			System.out.print(n%10+" ");
			n/=10;
		}
	}
	
	public void rect(int x, int y) {
		System.out.println();
		for (int i=0; i<y; i++) {
			for (int j=0; j<x; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}
	
	public void factors(int n) {
		System.out.println("1");
		for (int j=2; j<=n; j++) {
			System.out.print("1 ");
			for (int i=2; i<j; i++) {
				if (j%i==0) {
					System.out.print(i+" ");
				}
			}
			System.out.println(j);
		}
	}
	
	public static void main(String[] args) {
		TuesdayWarmUp runner = new TuesdayWarmUp();
//		runner.digits(285);
//		runner.rect(3, 2);
		runner.factors(8);
		
	}
}
