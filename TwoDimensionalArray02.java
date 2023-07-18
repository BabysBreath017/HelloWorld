public class TwoDimensionalArray02{
	public static void main(String[] agrs) {
		int[][] arr = new int[10][];//创建了二维数组，只确定了一维数组的个数
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;
			}
		}
		System.out.println("----arr元素-----");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			} 
			System.out.println();
		}
	}
}