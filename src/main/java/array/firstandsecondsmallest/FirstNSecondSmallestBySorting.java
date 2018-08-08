package main.java.array.firstandsecondsmallest;

/**
 * @Desc By Sorting (bubble sort)
 * @author amit
 *
 */
public class FirstNSecondSmallestBySorting {

	public static void main(String[] args) {
		
		int[] arr = {65,2,5,65,45,23,76,87,90};
		findSmallest(arr);
	}
	private static void findSmallest(int[] arr) {
		sort(arr);
		
		System.out.println(arr[0] +" and "+ arr[1]);
	}
	
	private static void sort(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
