public class Clock {
	private int tick;
	// create your methods here
	public void setTime(int a) {
		tick = a;
	}
	
	public void displayTime() {
		System.out.println(tick);
		
	}
	
	public void tick() {
		tick = (tick+1)%60;
		
		
	}
	
	public static void main(String[] args) {
		Clock tester = new Clock();
		
		// should display the time to be 56, 57, 58, 59, 0, 1, etc.
		tester.setTime(56);
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
		tester.tick();
		tester.displayTime();
	}
}