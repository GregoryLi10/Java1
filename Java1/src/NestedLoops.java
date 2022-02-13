
public class NestedLoops {
	//constant
	public void aToZ(){
		for(int i=65; i<91; i++) {
			System.out.print((char)i);
		}
		System.out.println();
	}
	//constant
	public void table() {
		for(int i=1; i<=12; i++) {
			for(int n=1; n<=12; n++) {
				System.out.print(i*n+" ");
			}
			System.out.println();
		}
	}
	//linear
	public void toX(int x) {
      for (int i=1; i<=x; i++){ 
    	 int t=0;
         for(int n=i; n>=1; n--){
        	 if(i%n==0){
        		 t+=1;
        	 }
         }
         if (t==2){
        	 System.out.print(i+" ");
         }	
      }	
      System.out.println();
	}
	//quadratic
	public void stars(int n) {
		for(int i=1; i<=n; i++) {	
			for(int x=1; x<=n; x++) {
				if (x==i||x==(n-i+1)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[]args) {
		NestedLoops runner=new NestedLoops();
		runner.aToZ();
		runner.table();
		runner.toX(100);
		runner.stars(5);
	}
}
