package Lec1;

import java.util.*;

public class QuickSort {
    
	public static int partition(int [] arr) {
		
		int n= arr.length;
		int i=0; 
		int j=0;
		
		int pivot=arr[n-1];
		
		while(j<n-1) {
			
			if(arr[j]<pivot) {
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}else {
				j++;
			}
		}
		
	   int temp= arr[n-1];
		arr[n-1]=arr[i];
		arr[i]=temp;
		
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
//         System.out.println("hello");
		
		int [] arr= {4,5,2,1,6,3};
		
		int [] res= new int [arr.length];
		
		 Stack<Integer> s= new Stack<Integer>();// stack , 
//		   store indexies of those value whose nge is not found till yet
		 
		 for(int i=0; i<arr.length;i++) {
			 
			  
			   while(s.size()>0 && arr[i]< arr[s.peek()] ) {
				   
				      res[s.peek()]=arr[i];
				      s.pop();
			   }
			   
			   s.push(i);
		 }
		 
		 while(s.size()>0) {
			 
			 res[s.peek()]=-1;  // s.top();
			 s.pop();
		 }
		
		
	}

}
