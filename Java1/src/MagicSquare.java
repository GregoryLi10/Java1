import java.util.Scanner;
public class MagicSquare {
private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter an integer: ");
		int terms=in.nextInt();
		int sum=0;
		int i=1;
		for (int x=1; i<=terms ; x++) {
			int y=(int) Math.pow(x, 2);
			for(int t=1; sum<y; t++) {
				sum+=t;
			}
			if (sum==y) {
				System.out.println(y);
				i++;
			}
			sum=0;
		}
	}
}