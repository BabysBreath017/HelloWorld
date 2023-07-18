/*
小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

这个题目最主要练习是：
	while循环 + 计数。
*/

public class Homework12{
	public static void main(String[] args) {
		int day = 0;
		double money = 0.0;
		while (money < 100) {
			day++;
			money += 2.5;
			if (day % 5 ==0) {
				money -= 6.0;
			}
		}
			System.out.println("小芳在第" + day +"天存到了" + money + "元");
	}
}

/*
public class Homework12{
	public static void main(String[] args){

		// 小芳每一天肯定会有2.5元的收入。
		// 小芳即使有一天花了6元，但是2.5元的收入还是有的。
		// 经过分析：总钱数肯定需要是double类型。int类型不行。

		int day = 0; // 天数的默认初始值是0
		double money = 0.0; // 钱的默认初始值是0

		/*
		while(true){
			day++; // 天数加1
			money += 2.5; // 钱加2.5元
			// 如果天数是5的倍数，那么花去6元
			if(day % 5 == 0){
				money -= 6.0;
			}
			// 什么时候循环结束呢？
			// 当money >= 100.0的时候，循环结束。
			if(money >= 100){
				break;
			}
		}
		

		// 改造之后的。
		while(money < 100){
			day++; // 天数加1
			money += 2.5; // 钱加2.5元
			// 如果天数是5的倍数，那么花去6元
			if(day % 5 == 0){
				money -= 6.0;
			}
		}

		//小芳通过74天存到了101.0元钱
		System.out.println("小芳通过" + day + "天存到了" + money + "元钱");

	}
}
*/