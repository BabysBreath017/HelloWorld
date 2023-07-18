import java.util.Scanner;
public class SeqSearch{
	public static void main(String[] args) {
		String[] names = {"青翼蝠王", "紫衫龙王", "金毛狮王", "白眉鹰王"};
		java.util.Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入名字");
		String findName = myScanner.next();
		
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			if(findName.equals(names[i])) {
				System.out.println("恭喜你找到" + findName);
				System.out.println("下标为：" + i);
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Sorry，没有找到。");
		}
	}
}