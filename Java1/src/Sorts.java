import java.util.Arrays;

public class Sorts {
	
	public static void selectionSort(int[]a) {
		for (int i=0; i<a.length; i++) {
			int temp=i;
			for (int j=i; j<a.length; j++) {
				if (a[j]<a[temp]) 
					temp=j;
			}
			int t=a[i];
			a[i]=a[temp];
			a[temp]=t;
		}
	}
	
	public static String[] red(String[] arr) {
		boolean[]a=new boolean[arr.length];
		for (int i=0; i<arr.length-1; i++) {
			arr[i]=arr[i].toLowerCase();
			arr[i+1]=arr[i+1].toLowerCase();
			if (arr[i].equals("north")&&arr[i+1].equals("south")||arr[i+1].equals("north")&&arr[i].equals("south")||arr[i+1].equals("east")&&arr[i].equals("west")||arr[i+1].equals("west")&&arr[i].equals("east")) {
				a[i]=true; a[i+1]=true;
			}
		}
		int c=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]==false) c++;
		}
		String[] b=new String[c];
		for (int i=0, j=0; i<c; i++, j++) {
			if (a[j]) {
				i--;
				continue;
			}
			b[i]=arr[j];
		}
		a=new boolean[b.length];
		for (int i=0; i<b.length-1; i++) {
			if (arr[i].equals("north")&&arr[i+1].equals("south")||arr[i+1].equals("north")&&arr[i].equals("south")||arr[i+1].equals("east")&&arr[i].equals("west")||arr[i+1].equals("west")&&arr[i].equals("east")) {
				a[i]=true; a[i+1]=true;
			}
		}
		c=0;
		for (int i=0; i<a.length; i++) {
			if (a[i]==false) c++;
		}
		String[] d=new String[c];
		for (int i=0, j=0; i<c; i++, j++) {
			if (a[j]) {
				i--;
				continue;
			}
			d[i]=b[j];
		}
		for (int i=0; i<d.length; i++) {
			d[i]=d[i].toUpperCase();
		}
		return d;
	}
	
	public static int nextSmaller(int n){
	    return n;
  }
	
	public static String encryptThis(String text) {
	      String[] a=text.split(" ");
	      String s="";
	      for (int i=0; i<a.length; i++){
	        s+=(int)((char)(a[i].charAt(0)));
	        s+=a[i].charAt(a[i].length());
	        s+=s.substring(2,a[i].length()-1);
	        s+=a[i].charAt(1)+" ";
	      }
	      return s;
	    }
	
	public static void main(String[] args) {
//		int[] a={4,3,2,5,6,1,2,5,8};
//		selectionSort(a);
//		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(red(new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
		
	}
}
