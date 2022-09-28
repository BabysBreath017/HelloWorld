public class ForTest01{
	public static void main(String[] args){
		
		/*
		for (int i = 100; i > 0;i %= 3 ){
			
			System.out.println("i ----> "+ i);
		}
		*/

		/*
		int sum = 0;
		for(int i = 1; i<= 100; i++){
			if (i % 2 ==1){
				sum += i;
			}
		}
		System.out.println("1~100所有奇数求和结果是："+ sum);
		*/


		int sum = 0;
		for (int i = 1;i <100 ;i +=2 ){
			sum += i;
		}
		System.out.println("1~100所有奇数求和结果是："+ sum);
	}
}