public class TwoDimensionalArray03{
	public static void main(String[] agrs) {
		int[][] arr = {{4, 6}, {1, 4, 4, 7},{100}};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("sum=" + sum);
		
	}
}