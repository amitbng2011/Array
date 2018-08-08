package SumClosestToZero;

/**
 * @Desc 1.Min requirement is to have min 2 elements
 * 2. Iterate through the array. Create min sum with first 2 index then keep on adding 2 elements
 *  and check with initial sum. If new sum is less than initial one, assign new sum to initial on and 
 *  print there value 
 *  
 * @author amit
 *
 */
public class SumClosestToZero {

	public static void main(String[] args) {
		int arr[] = {-91, 87, -11, 13, -54, 432};
		findClosestSumPair(arr);
	}
	
	private static void findClosestSumPair(int[] arr) {
		
		if(arr.length < 2)
	      {
	        System.out.println("Invalid Input");
	        return;
	      }
		int outerIndex=0;
		int innerIndex=1;
		int minSum=arr[0]+arr[1];
		for(int i = 0; i<arr.length-1; i++) {
			
			for(int j =i+1; j<arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(Math.abs(minSum)>Math.abs(sum)) {
					minSum = sum;
					outerIndex=i;
					innerIndex=j;
				}
			}
		}
		
		System.out.println(arr[outerIndex] + " "+ arr[innerIndex]);
		
	}
}
