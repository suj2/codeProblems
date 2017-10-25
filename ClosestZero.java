package java_coding;

import java.util.Arrays;

public class ClosestZero {
	
	
	public void pairOfNumbers(int arr[], int len)
	{
		int sum = 0, min_sum = 99999; 
		int l = 0,r = len-1;
		int min_l = 0, min_r = len-1; 
		
		if(len <2 ) {
			System.out.println("the number of elements is invalid ") ; 
		return ;
		}
		while(l<r)
		{
			System.out.println("inside the while loop");
			sum = arr[l] + arr[r]; 
			if(Math.abs(sum) < Math.abs(min_sum) )
			{
				min_sum = sum; 
				min_l = l ; 
				min_r = r; 
			}
			if(sum > 0 )
				r--; 
			else 
				l++; 
			System.out.println("l is  "+ l + " r is " + r ); 
			
		}
		
		System.out.println("the indexes are " + arr[min_l] + " and " + arr[min_r]); 
		
	
	}

	public static void main(String args[])
	{
		int arr[]= {-45,-34,-23,-10,-4,0,23,34,56,78,99};
		
		ClosestZero cz = new ClosestZero();
		System.out.println(Arrays.toString(arr));
		cz.pairOfNumbers(arr,arr.length); 
		return ; 
	}

}
