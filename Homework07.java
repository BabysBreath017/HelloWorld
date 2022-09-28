
// 计算 1+2-3+4-5+6-7....+100的结果

public class Homework07{
	public static void main(String[] args){
		int sum = 1;
		for (int i = 2; i <= 100; i++){
			if (i % 2 == 0){
				sum = sum + i;
			}else {
				sum = sum - i;
			}
		}
		System.out.println("1+2-3+4-5+6-7....+100的结果="+ sum);
	}
}

/*
 计算 1+2-3+4-5+6-7....+100的结果
 找规律：奇数时减法，偶数时加法。
 第一种思路：(除1之外)所有的偶数求和，所有的奇数求和，然后偶数求和的结果减去奇数求和的结果。
 第二种思路：循环过程中取出每个值，判断该数是偶数还是奇数，偶数就加，奇数就减。

写代码养成好习惯是：写一步测试一步。
public class Homework2{
	public static void main(String[] args){
		// 第一步：先别着急着完成，先能从1取到100
		int sum = 1; //sum的初始值不是0，而是1.
		for(int i = 2; i <= 100; i++){ // i从2开始。
			if(i % 2 == 0){ //偶数
				sum += i;
			}else{ // 奇数
				sum -= i; 
			}
		}
		System.out.println("结果=" + sum); // 52
	}
}
*/