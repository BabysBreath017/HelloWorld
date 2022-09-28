/*
根据指定月份，打印该月份所属的季节。
	3,4,5 春季 
	6,7,8 夏季 
	9,10,11 秋季 
	12, 1, 2 冬季

	if和switch各写一版
*/


// 自己的if版本
/*
public class HomeworkSwtich01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入当前月份，用整数[1-12]表示：");
		int month = s.nextInt();
		String str = "冬季";
		if (month < 1 || month > 12){
			str = "您输入的数字不合法！";
		}else if (month < 6 && month > 2){
			str = "春季";
		}else if (month < 9 && month > 5){
			str = "夏季";
		}else if (month < 12 && month > 8){
			str = "秋季";
		}
		System.out.println("当前月份为："+ str);
	}
}
*/


		// 老师的if版本
		/*
		class Homework1{
			public static void main(String[] args){
				java.util.Scanner s = new java.util.Scanner(System.in);
				System.out.print("请输入合法的数字【该数字可以是：1 2 3 4 5 6 7 8 9 10 11 12】:");
				int i = s.nextInt();

				String str = "输入的数字不合法";
				if(i == 3 || i == 4 || i == 5){
					str = "春季";
				}else if(i == 6 || i == 7 || i == 8){
					str = "夏季";
				}else if(i == 9 || i == 10 || i == 11){
					str = "秋季";
				}else if(i == 12 || i == 1 || i == 2){
					str = "冬季";
				}
				System.out.println(str);
				*/



// 自己的switch版本
public class HomeworkSwtich01{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入当前月份，用整数[1-12]表示：");
		int month = s.nextInt();
		String str = "您输入的数字不合法！";
		switch (month){
		case 3: case 4: case 5:
			str = "春季";
			break;
		case 6: case 7: case 8:
			str = "夏季";
			break;
		case 9: case 10: case 11:
			str = "秋季";
			break;
		case 12: case 1: case 2:
			str = "冬季";
		/*
			break;
		default:
			System.out.println(str);
		*/
		}
		System.out.println(str);
	}
}

		// switch版本
		/*
		String str = "输入的数字不合法";
		switch(i){
		case 3:case 4:case 5:
			str = "春季";
			break;
		case 6:case 7:case 8:
			str = "夏季";
			break;
		case 9:case 10:case 11:
			str = "秋季";
			break;
		case 12:case 1:case 2:
			str = "冬季";
		}
		System.out.println(str);

	}
}
*/