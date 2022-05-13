public class Main
{
	public static void main(String[] args) {
		print(0,0,0,10);
	}
	static void print(int i, int j, int s, int n){
	    if(i>n) return;
	    if((i!=0 && i!=n) && (j==0 || j==n+1)){
	        System.out.print("*");
	        print(i,j+1,s,n);
	    }
	    else if((i!=0 && i!=n) && s<n-1){
	        System.out.print(" ");
	        print(i,j,s+1,n);
	    }
	    else if((i!=0 && i!=n) && (j==1 || j==n+1)){
	        System.out.print("*");
	        print(i,j+1,s,n);
	    }
	    else if((i==0 || i==n) && j<=n){
	        System.out.print("*");
	        print(i,j+1,s,n);
	    }
	    else{
	        System.out.println("");
	        print(i+1,0,0,n);
	    }
	}
}
