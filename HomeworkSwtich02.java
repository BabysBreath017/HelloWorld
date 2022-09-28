//从键盘接收一个数字，判断该数字的正负
public class HomeworkSwtich02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入一个数字判断正负：");

		// int num = s.nextInt(); 需要double类型（自己的版本）
		double num = s.nextDouble();
		// 用三目运算符更简洁
		System.out.println(num < 0 ? "负数" : "正数");
		/* 
		自己的版本
		if (num >=0){
			System.out.println("您输入的数字"+ num + "为：正数");
		}else 
			System.out.println("您输入的数字"+ num + "为：负数");
		*/
	}
}


//老师的版本
/*
class Homework2{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入一个数字，我可以判断正负哦：");
		// 接收一个数字
		//int value = s.nextInt();
		double value = s.nextDouble();
		// 判断该数字正负
		/*
		if(value < 0){
			System.out.println("负数");
		}else{
			System.out.println("正数");
		}

		System.out.println(value < 0 ? "负数" : "正数");
	}
}
*/
