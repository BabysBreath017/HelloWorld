public class For01{
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		int star = 10;
		int end = 1100;
		int t =9;
		for(int i = star; i <= end; i ++) {
			if(i % t == 0) {
				System.out.println("i =" + i);
				count++;
				sum += i;
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}