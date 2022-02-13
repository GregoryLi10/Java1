public class FindDivisor {

  public void numberOfDivisors(int n) {
    // TODO please write your code below this comment
    int x=1;
    int output=0;
    while (!(x==n)){
      if (n%x==0){
        output=output+1;
        x=x+1;
      }
      else {
        x=x+1;
      }
    }
    if (x==n){
      output=output+1;    
    }
    System.out.println(output);
  }
  public static void main(String[] args) {

			FindDivisor runner = new FindDivisor();

			runner.numberOfDivisors(5);
  }
}