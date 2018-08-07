package main.java.array.leadersinarray;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		findLeaders(arr);
	}
	
	/**
	 * Iterate from right, right most element is always leader.
	 *  whenever arr[i] > arr[i-1], that elemet would be leader
	 * @param arr
	 */
	private static void findLeaders(int[] arr) {
		
		System.out.println(arr[arr.length-1]);
		for(int i = arr.length-2; i>0; i--) {
			if(arr[i] > arr[i-1]) {
				System.out.println(arr[i]);
			}
		}
	}
}
