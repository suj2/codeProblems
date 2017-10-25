package java_coding;

public class FixedPoint {
	
	public int binaryfixedpoint(int arr[], int l, int r)
	{
		if(l<=r)
		{
			int mid = l+(r-l)/2; 
			if(arr[mid] == mid)
				return mid; 
			if(arr[mid] > mid)
			{
				return binaryfixedpoint(arr,l,mid-1 );
		}
			if(arr[mid] < mid)
			{
				return binaryfixedpoint(arr,mid+1,r); 
			}
	}
		return -1; 

}
	public static void main(String args[])
	{
		int arr[] = {-32,-22,-2,1,2,5};
		FixedPoint f = new FixedPoint(); 
		System.out.println("the fixedpoint is " + f.binaryfixedpoint(arr, 0, arr.length-1));
	}
}

