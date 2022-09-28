import java.util.Scanner;

public class KeyInput01{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("欢迎使用小型迷你加法计算器");
		System.out.println("请输入第一个数字：");
		int num1 = s.nextInt();
		System.out.println("请输入第二个数字：");
		int num2 = s.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
	}
}