public class IfTest03{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入您的成绩：");
		double score = s.nextDouble();
		String str = "优秀";
		if (score < 0 || score >100){
			System.out.println("您输入的成绩不合法");
			return;
		}else if (score < 60){
			str = "不及格";
		}else if (score < 70){
			str = "及格";
		}else if (score < 80){
			str = "中等";
		}else if (score < 90){
			str = "良好";
		}
		System.out.println(str);
	}
}