
public class HumanClass {
	
	private int age; 
	private char gender;
	private int age2;
	private char gender2;
	
	public void setAge(int x) {
		age = x;
	}
	
	public void setGender(char x) {
		gender = (char)x;
	}
	
	public void vote() {
		if (age>17){
			System.out.println("can vote");
		}
		else {
			System.out.println("cannot vote");
		}
	}
	
	public void tetanusShot() {
		if (age%4==0) {
			System.out.println("yes tetanus shot");
		}
		else {
			System.out.println("no tetanus shot");
		}
	}

	public void toddler() {
		if (age<4) {
			if (gender=='b') {
				System.out.println("toddler boy");
			}
			else if (gender=='g') {
				System.out.println("toddler girl");
			}
		}
		else {
			System.out.println("not toddler");
		}
	}
	
	public void movieDiscount() {
		if (age>65||age<15) {
			System.out.println("yes movie discount");
		}
		else {
			System.out.println("no movie discount");
		}
	}
	
	public void teenager() {
		if (age>12&&age<18) {
			System.out.println("yes teenager");
		}
		else {
			System.out.println("not teenager");
		}
	}
	
	public void human(int x, char y) {
		age2 = x;
		gender2 = (char)y;
	}
	
	public void teammates() {
		if (gender==gender2&&age-age2<3&&age-age2>-3) {
			System.out.println("yes teammates");
		}
		else {
			System.out.println("no teammates");
		}
	}
	
	public static void main(String[] args) {

			HumanClass runner = new HumanClass();

			runner.setAge(6);
			runner.setGender('b');
			runner.vote();
			runner.tetanusShot();
			runner.toddler();
			runner.movieDiscount();
			runner.human(8, 'b');
			runner.teammates();
	}
}