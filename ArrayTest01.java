public class ArrayTest01{
	public static void main(String[] args) {
		char[] chars = new char[26];//创建一个数组
		
		//放置‘数组
		for(int i = 0; i < chars.length; i++) {
			chars[i] = (char)('A' + i);
		}
		//打印数组
		System.out.println("----chars数组----");
		for(int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] +  " ");
		}
	}
}