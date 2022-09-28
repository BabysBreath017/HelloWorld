 public class Homework01{
	 public static void main(String[] args){
		 int x = 10;
		 int a = x + x++;//
		 System.out.println("a=" + a);//20(x到这变成11了)
		 System.out.println("x=" + x);//11
		 //int temb = ++x; 12
		 int b = x + ++x;//11 + 12 = 23,x变成12；
		 System.out.println("b=" + b);//23
		 System.out.println("x=" + x);//12
		 //int temb = x--; 12
		 int c = x + x--;//12 + 12 = 24
		 System.out.println("c=" + c);//24
		 System.out.println("x=" + x);//11
		 //int temb = --x;10
		 int d = x + --x;//11 + 10 = 21
		 System.out.println("d=" + d);//21
		 System.out.println("x=" + x);//10
	 }
 }