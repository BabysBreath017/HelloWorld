
//计算1000以内所有不能被7整除的整数之和

public class Homework06{
	public static void main(String[] args){
		int sum = 0;
		for (int i = 1; i<= 1000; i++){
			if (i % 7 != 0){
				sum = sum + i;
			}
		}
		System.out.println( "1000以内所有不能被7整除的整数之和:"+ sum);
	}
}

/*
应该怎么去编程？？？？？？？

计算1000以内所有不能被7整除的整数之和
	1、解决一个问题的时候，可以先使用汉语描述思路。（养成好习惯）
	2、复杂的问题可以“一步一步”去实现，没必要一下全部实现。

把上面的题目可以拆分成几步去完成：

	第一步：从1开始循环，循环到1000，先保证每一个数字你都能取到。

	第二步：在以上第一步的循环过程中，一个数字一个数字筛查，判断该数字是否
	是“不能被7整除的整数”。

编程思想/思路，都是一步一步分析，积累出来的。
编程最主要的是写汉语思路。思路有了，代码就不远了。

把问题拆开，一个一个去解决一下。

不断写代码，不断的积累编程“模型”。

public class Homework1{

	public static void main(String[] args){

		// 在外部准备一个变量，用来存储求和的结果
		int sum = 0;
	
		//循环的时候你能想起来for while do..while
		for(int i = 1; i <= 1000; i++){ //第一步
	
			// 判断的时候你能想起来使用if
			if(i % 7 != 0){ // 第二步
				// 此时的i是不能被7整除的，这个i应该此时纳入求和/累加。
				//sum += i;
				sum = sum + i;
			}
	
		}
	
		// 在for循环结束之后，结果才计算完成，所以在这里输出。
		System.out.println("sum = " + sum); //429429


	}
}
*/