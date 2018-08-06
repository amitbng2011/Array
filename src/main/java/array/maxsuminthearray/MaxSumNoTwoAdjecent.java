package main.java.array.maxsuminthearray;

public class MaxSumNoTwoAdjecent {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(maxSum(arr));
	}

	private static int maxSum(int[] arr) {
		
		int incl = arr[0];
		int excl = 0;
		int max;
		
		for(int i = 1; i < arr.length; i++) {
			max = (incl>excl) ? incl : excl;
			incl = excl + arr[i];
			excl = max;
		}
		
		return (incl> excl) ? incl : excl;
	}
	
	/**
	 * @param arr
	 */
	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
