package Lec1;

public class Selection_sort {
  public static void insert(int [] arr, int i, int item) {
	  
	  while(i>=0 && arr[i]>item) {
		  arr[i+1]=arr[i];
		  i--;
	  }
	  arr[i+1]=item;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr= {5,4,3,2,1};
       
//       for(int i=0; i<arr.length;i++) {
//    	   
//    	   int min_index=i;
//    	   
//    	   for(int j=i;j<arr.length;j++) {
//    		   
//    		  if(arr[j]<arr[min_index]) {
//    			  min_index=j;
//    		  }
//    	   }
//    	   int temp=arr[i];
//    	   arr[i]=arr[min_index];
//    	   arr[min_index]=temp;
//       }
       
       // Insertion Sort 
       
       for(int i=1; i<arr.length;i++) {
    	   
    	   insert(arr,i-1,arr[i]);
       }
       
       
       for(int i=0; i<arr.length;i++) {
    	   System.out.print(arr[i]+" ");
       }
       
	}

}
