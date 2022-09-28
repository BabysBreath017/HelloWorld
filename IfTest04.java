public class IfTest04{
	public static void main(String[] agrs){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入您的性别，输入1表示男，输入0表示女：");
		int sex = s.nextInt();
		System.out.println("请输入当前的天气，输入1表示雨天，输入0表示晴天：");
		int weather = s.nextInt();
		if (weather == 1){
			System.out.println("雨天");
			if (sex == 1){
			System.out.println("下雨了，小哥哥，打一把大黑伞吧！");
			}else if (sex == 0){
			System.out.println("下雨了，小姐姐，打一把小花伞吧！");
			}
		}else if (weather == 0){
			System.out.println("晴天");
			if (sex == 1){
			System.out.println("出太阳了，小哥哥，直接走起，出去玩耍吧！");
			}else if (sex == 0){
			System.out.println("出太阳了，小姐姐，擦点防晒霜再出去玩耍吧！");
			}
		}
	}
}