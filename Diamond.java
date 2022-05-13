public class Main
{
	public static void main(String[] args) {
	    int n=10, i=0, s=0;
	    int x=2*n-2;
	    int j=x; 
	    print(0,0,0,n);
	    printt(i,j,s,n,x);
	   
	}
	static void print(int i, int j, int s, int n){
	   if(i>n) return;
	   if(s<n-i){
	       System.out.print(" ");
	       print(i,j,s+1,n);
	   }
	   else if(j<2*i+1){
	       System.out.print("*");
	       print(i,j+1,s,n);
	   }
	   else{
	       System.out.println("");
	       print(i+1,0,0,n);
	   }
	}
	static void printt(int i, int j, int s, int n,int x){
	 if(i>n) return;
	 if(s<=i){
	     System.out.print(" ");
	     printt(i,j,s+1,n,x);
	 }
	 else if(j>=0){
	     System.out.print("*");
	     printt(i,j-1,s,n,x);
	 }
	 else{
	     System.out.println("");
	     printt(i+1,x-2,0,n,x-2);
	 }
	}
}
