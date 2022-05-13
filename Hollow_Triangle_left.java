public class Main
{
	public static void main(String[] args) {
		print(0,1,0,20);
	}
	static void print(int i, int j, int s, int n){
	    if(i>n) return;
	    if(j==0){
	        System.out.print("*");
	        print(i,j+1,s,n);
	    }
	    else if(s<=i-1 && i!=0 && i!=n){
	        System.out.print(" ");
	        print(i,j,s+1,n);
	    }
	    else if((i==0 || i==n) && j<=i){
	        System.out.print("*");
	        print(i,j+1,s,n);
	    }
	    else{
	        System.out.print("*");
	        System.out.println("");
	        print(i+1,0,0,n);
	    }
	}
}
