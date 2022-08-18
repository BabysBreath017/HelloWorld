public class BankAccount {
  	public static void main(String[] args){
  		/*
  		 * Addition and subtraction, using + and -
  		 *  加法和减法，使用 + 和 - 
  		 * Multiplication and division, using * and /
  		 * 乘法和除法，使用 * 和 /
  		 * The modulo operator for finding remainders, %
  		 * 用于查找余数的模运算符： %
  		 * Compound assignment operators +=, -=, *=, /=, and %=.
  		 * 复合赋值运算符： +=, -=, *=, /=, and %=
  		 * The order of operations: parentheses -> exponents -> multiplication, division, modulo -> addition, subtraction
  		 * 运算顺序：括号 -> 指数 ->乘法、除法、模数 ->加法、减法
  		 * Greater than, >, and less than, <
  		 * 大于 》 小于 《
  		 * Equal to, ==, and not equal to, !=
  		 * 等于 == 和不等于 ！=
  		 * Greater than or equal to, >=, and less than or equal to, <=
  		 * 大于等于 》= 或 小于等于《=
  		 * 。equals() for comparing Strings and other objects
  		 * 。equals() 用于比较 String 和 其他对象
  		 * Using + to concatenate Strings
  		 * + 用于连接字符串
  		 * The final keyword which makes variables unchangeable
  		 * final 最终关键字使变量不可更改
  		 */
  		
          double balance = 1000.75;
          double amountToWithdraw = 250;
          double updatedBalance = balance - amountToWithdraw;
          double amountForEachFriend = updatedBalance / 3;
          boolean canPurchaseTicket = amountForEachFriend >= 250; 
          System.out.println(canPurchaseTicket);
          System.out.println("I gave each friend " + amountForEachFriend + "...");
    }       
}
