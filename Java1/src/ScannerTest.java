import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("enter fourth digit: ");
		int digit4=input1.nextInt();
		System.out.println("enter third digit: ");
		int digit3=input1.nextInt();
		System.out.println("enter second digit: ");
		int digit2=input1.nextInt();
		System.out.println("enter first digit: ");
		int digit1=input1.nextInt();
		System.out.println(digit4+digit3*10+digit2*100+digit1*1000);
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("enter operator or string: ");
		String op=input2.next();
		System.out.println("enter an integer: ");
		int num1=input2.nextInt();
		System.out.println("enter another integer: ");
		int num2=input2.nextInt();
		if (op.equals("/")) {
			System.out.println(num1/num2);
		}
		else if (op.equals("*")) {
			System.out.println(num1*num2);
		}
		else if (op.equals("+")) {
			System.out.println(num1+num2);
		}
		else if (op.equals("-")) {
			System.out.println(num1-num2);
		}
		else if (op.equals("%")) {
			System.out.println(num1%num2);
		}
		else {
			char x = (char)num1;
			char y = (char)num2;
			System.out.println(op+x+y);
		}
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("number of touchdowns: ");
		int touchDowns=input3.nextInt();
		System.out.println("number of field goals: ");
		int fieldGoals=input3.nextInt();
		System.out.println("total score: ");
		int totalScore=input3.nextInt();
		int fieldGoals2=totalScore%7;
		if (fieldGoals2==0) {
			if(touchDowns*7==totalScore) {
				System.out.println("yes");
			}
		}
		else if (fieldGoals2==3) {
			if (fieldGoals>0) {
				if(touchDowns*7>totalScore||touchDowns*7+fieldGoals*3>=totalScore) {
					System.out.println("yes");
				}
			}
		}
		else if (fieldGoals2==6) {
			if (fieldGoals>1) {
				if(touchDowns*7>totalScore||touchDowns*7+fieldGoals*3>=totalScore) {
					System.out.println("yes");
				}
			}
		}
		else {
			System.out.println("no");
		}
		
		Scanner input4 = new Scanner(System.in);
		System.out.println("enter a number between 0-999: ");
		int number1=input4.nextInt();
		int larger, largest=0;
		
		larger=number1%10;
		if(largest<larger) {
			largest=larger;
		}
		number1=number1/10;
		larger=number1%10;
		
		if(largest<larger) {
			largest=larger;
		}
		number1=number1/10;
		larger=number1%10;
		
		if(largest<larger) {
			largest=larger;
		}
		number1=number1/10;
		System.out.println(largest);
		
	}
	
}
