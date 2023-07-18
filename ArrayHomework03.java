public class ArrayHomework03{
	public static void main(String[] args) {
		int[] arr = {20, -1, 89, 2, 890, 7};
		
		int temp = 0;//辅助交换
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				//如果是从大到小，条件是arr[j] < arr[j+1]
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("\n----排序后----");
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}