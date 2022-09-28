public class HomeworkSwtich{
	public static void main(String[] agrs){
		java.util.Scanner s = new java.util.Scanner(System.in); 
		System.out.println("请输入您的考试成绩：");
		double score = s.nextDouble();
		if (score < 0 || score > 100){
			System.out.println("您输入的学生成绩不合法，再见！");
			return;
		}
		int grade = (int)(score / 10);
		String str = "不及格";
		switch (grade){
		case 10:case 9:
			str = "优秀";
			break;
		case 8:
			str = "良好";
			break;
		case 7:
			str = "中等";
			break;
		case 6:
			str = "及格";
		}
		System.out.println("该学生的成绩等级为："+ str);
	}
}