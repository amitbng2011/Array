package main.java.array.rotatearray;

/**
 * @Logic To rotate by one, store arr[0] in a temporary variable temp,
 *  move arr[1] to arr[0], arr[2] to arr[1] …and finally temp to arr[n-1]
 *  
 *  Algorithm
 * leftRotate(arr[], d, n)
start
  For i = 0 to i < d
    Left rotate all elements of arr[] by one
end
 * @author amit
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int byElement = 2;
		for(int i = 0; i<2; i++) {
			
			leftRotate(arr, byElement);
		}
		
		printArray(arr);
		
	}
	
	/**
	 * @param arr
	 * @param d
	 */
	private static void leftRotate(int[] arr, int d) {
		
		int j, temp;
		temp = arr[0];
		for(j = 0; j<arr.length-1;  j++) {
			arr[j] = arr[j+1];
		}
		arr[j] = temp;
		
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
