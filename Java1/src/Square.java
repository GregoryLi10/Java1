public class Square {    
    public static boolean isSquare(int n) {  
    	if(Math.sqrt(n)%1==0) {
    	return true;
    	}
    	else {
        return false;
    	}// fix me!
    }
    public static void main(String[] args) {

		Square runner = new Square();

		runner.isSquare(4);
}
}