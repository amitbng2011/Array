package main.java.array.inversionofarray;

public class InversionsInArray {

	public static void main(String[] args) {
		int[] arr = {6,5,4,3,2,1};
		System.out.println(findInversions(arr));
	}
	
	private static int findInversions(int[] arr) {
		int count=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
