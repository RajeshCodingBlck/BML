package OOPsDemo;

public class NQueue_problem {
   
	public static void Comb(int [] arr, int count, int queen, String ans) {
		
		
		if(count>queen) {
			
			System.out.println(ans);
			return ;
		}
		
		
		for(int i=0; i<arr.length;i++) {
			
			if(arr[i]==0) {
				arr[i]=1;
				Comb(arr, count+1, queen, ans+"q"+ count + " box"+ i+" " );
				arr[i]=0;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int [] arr=new int[4];
		long start= System.nanoTime();
		
		Comb(arr, 1,2,"");
		
		long end=  System.nanoTime();
		
		System.out.println(end-start);
		
	}

}
