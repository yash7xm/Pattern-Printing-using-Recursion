public class Main
{
	public static void main(String[] args) {
	    print(0,0,0,5);
	}
	static void print(int i, int j, int s, int n){
	    if(i>n) return;
	    if(s<n-i){
	        System.out.print(" ");
	        print(i,j,s+1,n);
	    }
	    else if(j<=i){
	        System.out.print("*");
	        print(i,j+1,s,n);
	    }
	    else{
	        System.out.println("");
	        print(i+1,0,0,n);
	    }
	}
}
