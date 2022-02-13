
public class SA4 {
	
	// create your methods here
	public void distance(double x1, double y1, double x2, double y2) {
		System.out.println(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
		
	}
	
	public void quadratic(double a, double b, double c) {
		double x1, x2;
		x1 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
		x2 = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
		System.out.println("Solution 1: "+x1);
		System.out.println("Solution 2: "+x2);
		
	}
	
	public void charAverage(char a, char b) {
		int c1 = (a+b)/2;
		char c2 = (char)c1;
		System.out.println(c2);
		
	}
	
	public static void main(String[] args) {
		
		SA4 tester = new SA4();
		
		// prints out the distance between two points
		// output should be 6.83
		tester.distance(1, -2.5, 3.1, 4);
		
		// prints out a solution to y = ax^2 + bx + c, where the 
		// three parameters are a, b, and c. Use the quadratic equation
		// output should be 2 or -2 (challenge: give both solutions)
		tester.quadratic(1, 0, -4);
		
		// prints out the 'average' of two characters
		// output should be 'W'
		tester.charAverage('m', 'A');
	}

}
