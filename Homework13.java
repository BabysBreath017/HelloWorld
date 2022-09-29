
/*
 一个数如果恰好等于它的因子之和，这个数就是完数，例如 6 = 1 + 2 + 3，编程
找出1000内所有的完数。
*/

public class Homework13{
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for(int j = 1; j <= i / 2; j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			if(i == sum) {
				System.out.println(i+"是完数");
			}
		}
	}
}


/*

什么是完数？
	一个数如果恰好等于它的因子之和，这个数就是完数。

那么因子怎么找？
	10的因子？
		10 % 1 == 0
		10 % 2 == 0
		10 % 5 == 0
	不算10本身。
	10的因子：
		1 + 2 + 5 = 8

运行结果：
	6
	28
	496

public class Homework7{
	public static void main(String[] args){
		// 1不属于完数。从2开始判断
		// 第一步：先从1到1000，每个数字都取出来
		for(int i = 2; i <= 1000; i++){
			// 第二步：在这里可以拿到i，那么此时应该判断i是否是一个完数。
			// 这个数字有了，找这个数字的因子。
			// 假设现在这个数字就是6，i等于6
			int sum = 0;
			for(int j = 1; j <= i / 2; j++){
				//j取到的值是：1 2 3 4 5
				//但实际上j取到哪儿就行了：1 2 3，取这几个数就行了。
				//取到一半就行。
				if(i % j == 0){
					//此时j就是因子。
					// 记得将因子j追加，累计。
					sum += j;
				}
			}
			// 以上for结束表示：所有因子求和完毕了。
			if(i == sum){
				//i是一个完数
				System.out.println(i);
			}
		}
	}
}
*/