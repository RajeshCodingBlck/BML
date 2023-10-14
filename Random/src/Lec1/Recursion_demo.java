package Lec1;

public class Recursion_demo {
   // define fact -> Take N, give  me N!
	
	
	public static int fact(int n) {
		
		 if(n==0) {
			 return 1;
		 }
		 int chota_ans= fact(n-1); // Recursion  (N-1)!
		 int mera_ans= n*chota_ans;
		 return mera_ans;	  
	}
	
	
	public static int CoinToss(int n, String ans) {
		  
		    if(n==0) {
		    	System.out.println(ans);
		    	return 1;
		    }
		
		 int ans1=  CoinToss(n-1, ans+"H");
		 int ans2=  CoinToss(n-1, ans+"T");
		   
		  return ans1+ans2; 
	}
	
	public static void Subseq(String ques, String ans) { // "abc"
		
		if(ques.length()==0) {
			
			System.out.println(ans);
			return;
		}
		
		char ch= ques.charAt(0);
		
		 Subseq(ques.substring(1), ans +"");
		 Subseq(ques.substring(1), ans+ch);
	}
	
	
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibo(n-1)+ fibo(n-2);
	}
	
	public static void Stairs(int n, String path) {
		
		  
		 if(n==0) {  // +ve Base Case
			 System.out.println(path);
			 return;
		 }
		 
		 if(n<0) { // -Ve Base Case
			 return;
		 }
		 
		 
		  
		 Stairs(n-1, path+"1");
		 Stairs(n-2, path+"2");
	}
	
	public static void RatInMaze(int r, int c, int des_r, int des_c, String path) {
		
		if(r==des_r && c== des_c) {
			
			System.out.println(path);
			return;
		}
		
		if(r>des_r ||  c>des_c) {
			
			return ;
		}
		
		  
		RatInMaze(r,c+1, des_r, des_c, path+"R ");
		RatInMaze(r+1,c, des_r, des_c, path+"D ");
	}
	
	public static int sumofNatural(int n) {
		
		if(n==1) {
			
			return 1;
		}
		
		int chota_ans=sumofNatural(n-1); // recursion  
		
		int mera_ans= n+ chota_ans;
		
		return mera_ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
//		System.out.println(fact(5));
		
//		System.out.println(sumofNatural(5));
		
		
		
		System.out.println(CoinToss(1,""));
		
//		Subseq("abc", "");
		
//		Stairs(5,"");
		
//		RatInMaze(0,0,2,2,"");
		
	}

}
