package main.java.array.leadersinarray;

public class LeadersInArrayBySimpleIteration {

	public static void main(String[] args) {
		int[] arr = {16, 17, 4, 3, 5, 2};
		findLeaders(arr);
	}
	private static void findLeaders(int[] arr) {
		int j=0;
		for(int i = 0; i <arr.length; i++) {
			
			for(j = i+1; j<arr.length; j++) {
				if(arr[j]>= arr[i]) {
					break;
				}
			}
			if(j==arr.length) {
				System.out.println(arr[i]);
			}
		}
	}
}
