public class RecursionExercise01 { 

	//编写一个main方法
	public static void main(String[] args) {

		T t1 = new T();
		 int n = 7;
		 int res = t1.fibonacci(n);
		 if(res != -1) {
		 	System.out.println("当n="+ n +" 对应的斐波那契数=" + res);
		 } 
	}
}

class T {
		/*
		请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多
		思路分析
		1. 当n = 1 斐波那契数 是1
		2. 当n = 2 斐波那契数 是1
		3. 当n >= 3  斐波那契数 是前两个数的和
		4. 这里就是一个递归的思路
		 */
	
		public int fibonacci(int n) {
			if( n >= 1) {
				if( n == 1 || n == 2) {
					return 1;
				} else {
					return fibonacci(n-1) + fibonacci(n-2);
				}
			} else {
				System.out.println("要求输入的n>=1的整数");
				return -1;
			}
		}
	
}