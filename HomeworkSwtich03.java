
//从键盘接收一个数字，判断该数字的奇偶。

public class HomeworkSwtich03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入一个数字判断奇偶：");
		int num = s.nextInt();
		System.out.println(num % 2 ==0 ? "偶数": "奇数");
	}
}


/*老师的版本
class Homework3{
	public static void main(String[] args){
		
		//创建一次。
		java.util.Scanner s = new java.util.Scanner(System.in);

		while(true){
			System.out.print("请输入一个数字，可以判断奇数偶数哦（输入0表示退出系统）：");
			int value = s.nextInt();
			if(value == 0){
				// 退出系统，结束程序
				return; //后面讲。
			}
			System.out.println(value % 2 == 0 ? "偶数" : "奇数");
		}
	}
}
*/