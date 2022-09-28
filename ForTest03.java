
// 九九乘法表

public class ForTest03{
	public static void main(String[] args){
		for (int i = 1; i <= 9; i++){
			// System.out.println(i);
			for (int j = 1; j <= i; j ++){
				System.out.print(j + "*" + i + "=" + (i*j) +"  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 9; i++){
			for (int j =1; j <= i; j++){
				System.out.print(j + "+" + i + "=" + (i+j) + "   ");
			}
			System.out.println();
		}
	}
}