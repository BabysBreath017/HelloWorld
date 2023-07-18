
import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] agrs) {
		
		Scanner myScanner = new Scanner(System.in);
		int [] arr = {1, 2, 3};
		
		do {
			int [] arrNew = new int[arr.length + 1];
			//遍历数组，一次将arr的元素拷贝到 arrNew数组
			for(int i = 0; i < arr.length; i++) {
				arrNew[i] = arr[i];
			}
			System.out.println("请输入你要添加的元素");
			int addNum = myScanner.nextInt();
			
			//把addNum赋给arrNew最后一个元素
			arrNew[arrNew.length - 1] = addNum;
			//让 arr 指向 arrNew
			arr = arrNew;
			
			System.out.println("-----arr扩容后元素情况-----");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			//询问用户是否继续
			System.out.println("是否继续添加 y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n') {
				break;
			}
		}while(true);
		System.out.println("你退出了添加……");
	}
}