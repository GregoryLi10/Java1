
public class BooleanPractice3 {

	public void smallest(int x, int y, int z) {
		if (x<y&&x<z){
			System.out.println(x);
		}
		if (y<x&&y<z){
			System.out.println(y);
		}
		if (z<x&&z<y){
			System.out.println(z);
		}
	}
	
	public void within(char a, char b) {
		if (a>=97) {
			a-=32;
		}
		if (b>=97) {
			b-=32;
		}
		if (a-b<=2||b-a<=2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	public static void main(String[]args) {
		BooleanPractice3 runner = new BooleanPractice3();
		runner.smallest(5,4,3);
		runner.within('A', 'D');
	}
}
