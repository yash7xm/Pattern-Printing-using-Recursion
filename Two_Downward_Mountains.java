public class Main
{
	public static void main(String[] args) {
	    int i=0, n=5, s=0, j=n+1, x=n+1;
		print(i,j,s,n,x);
	}
	static void print(int i, int j, int s, int n, int x){
	    if(i>n) return;
	    if(j>0){
	        System.out.print("*");
	        print(i,j-1,s,n,x);
	    }
	    else if(s<2*i){
	        System.out.print(" ");
	        print(i,j,s+1,n,x);
	    }
	    else if(j>-x){
	        System.out.print("*");
	        print(i,j-1,s,n,x);
	    }
	    else{
	        System.out.println("");
	        print(i+1,x-1,0,n,x-1);
	    }
	}
}
