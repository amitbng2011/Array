package main.java.array.rotatearray;


/**
 * Algorithm :
  rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], 1, n);
  
 * @author amit
 *
 */
public class RotateArrayByReversalAlgorithm {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int byElement = 2;
		
		rotateArray(arr, byElement);;
		printArray(arr);
	}

	private static void rotateArray(int[] arr, int d) {
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, arr.length-1);
		reverseArray(arr, 0, arr.length-1);
		
	}
	
	private static void reverseArray(int[] arr, int start, int end) {

		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
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
