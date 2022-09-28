/*
整数大小比较：输入两个整数，比较大小，
	若x>y 输出 >
	若x=y 输出 =
	若x<y 输出 <
*/

public class Homework05{
	public static void main(String[] agrs){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int x = s.nextInt();
		System.out.println("请输入第二个整数：");
		int y = s.nextInt();
		if (x > y){
			System.out.println(x + ">" + y);
        }else if (x == y){
			System.out.println(x + "=" + y);
        }else
			System.out.println(x + "<" + y);
	    

		// 三目运算符怎么表示
	}
}