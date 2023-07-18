public class ArrayTest02{
	public static void main(String[] args) {
		
		//找出最大数组和对应的下标
		int[] arr = {4,-1,9,87,999};
		int max = arr[0];//假设第一个元素就是最大值
		int maxIndex = 0;
		
		for(int i = 1;i < arr.length; i++) {//开始遍历数组
			
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + " maxIndex=" + maxIndex);
	}
}