
public class Main
{
	public static void main(String[] args) {
		
		print(0, 0, 5);
		
	}
	static void print(int i, int j, int n){
		
	    if(i > n) return;
		
	    if(j <= n - i){
	        System.out.print("* ");
	        print(i, j + 1, n);
	    }
		
	    else{
	        System.out.println("");
	        print(i + 1, 0, n);
	    }
		
	}
}
