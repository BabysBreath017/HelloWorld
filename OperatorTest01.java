
/*
   x自诞生以来是byte类型，那么x变量的类型永远都是byte。不会变。
			不管后面是多大的数字。
*/
public class OperatorTest01{
	public static void main(String[] args){
		byte x = 100;
		x += 10;
		/*
		   x = x + 1;错误: 不兼容的类型: 从int转换到byte可能会有损失
                x = x + 1;
                    ^
		*/
		System.out.println(x);
	}
}