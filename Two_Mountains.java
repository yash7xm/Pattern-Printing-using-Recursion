public class Main
{
	public static void main(String[] args) {
	    int i=0, j=0, n=10, s=2*n, x=2*n;
		print(i,j,s,n,x);
	}
	static void print(int i, int j, int s, int n, int x){
	    if(i>n) return;
	    if(j<i+1){
	        System.out.print("*");
	        print(i,j+1,s,n,x);
	    }
	    else if(s>0){
	        System.out.print(" ");
	        print(i,j,s-1,n,x);
	    }
	    else if(j/2<i+1){
	        System.out.print("*");
	        print(i,j+1,s,n,x);
	    }
	    else {
	        System.out.println("");
	        print(i+1,0,x-2,n,x-2);
	    }
	}
}
