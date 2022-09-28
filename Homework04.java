public class Homework04{
	public static void main(String[] args){
	int i = 5;
	int j = 5;
	int m = 5;
	int n = 5;
	i++;//这行代码执行结束后，i = 6
	j = j + 1;//这行代码执行结束后，j = 6
	m--; //这行代码执行结束后，m = 4
	n = n - 1;//这行代码执行结束后，n = 4
	System.out.println(i);// 6
	System.out.println(i++);// 6(先赋值再运算，先i=6，然后这行代码结束之后i自加一等于7)
    System.out.println(++i);// 8
	System.out.println(i--);// 8(先赋值再运算，先i=8，然后这行代码结束之后i自减一等于7)
	System.out.println();
	System.out.println(j);// 6
	System.out.println(j++);// 6
	System.out.println(j--);// 7
    System.out.println(--j);// 5
	System.out.println();
	System.out.println(m);// 4
	System.out.println(n);// 4
	}
}