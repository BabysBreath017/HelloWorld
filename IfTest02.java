public class IfTest02{
	public static void main(String[] args){
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入您的年龄：");
		int age = s.nextInt();
		
		
		/*
		嵌套语句
		if (age < 0 || age > 150){
			System.out.println("对不起，年龄值不合法");
		}else{
			if(age <= 5){
				System.out.println("您的年龄阶段是：婴幼儿");			
			}else if(age <= 10){
				System.out.println("您的年龄阶段是：少儿");
			}else if(age <= 18){
				System.out.println("您的年龄阶段是：少年");
			}else if(age <= 35){
				System.out.println("您的年龄阶段是：青年");
			}else if(age <= 55){
				System.out.println("您的年龄阶段是：中年");
			}else {
				System.out.println("您的年龄阶段是：老年");
			}
		}
		*/


		/*
		不嵌套进else语句中，直接写else if
		if (age < 0 || age > 150){
			System.out.println("对不起，年龄值不合法");
		}else if(age <= 5){
			System.out.println("您的年龄阶段是：婴幼儿");			
		}else if(age <= 10){
			System.out.println("您的年龄阶段是：少儿");
		}else if(age <= 18){
			System.out.println("您的年龄阶段是：少年");
		}else if(age <= 35){
			System.out.println("您的年龄阶段是：青年");
		}else if(age <= 55){
			System.out.println("您的年龄阶段是：中年");
		}else {
			System.out.println("您的年龄阶段是：老年");
		}
		*/



		String str = "老年";
		if (age < 0 || age > 150){
			System.out.println("对不起，年龄值不合法");
			return;
		}else if(age <= 5){
			str = "婴幼儿";			
		}else if(age <= 10){
			str = "少儿";
		}else if(age <= 18){
			str = "少年";
		}else if(age <= 35){
			str = "青年";
		}else if(age <= 55){
			str = "中年";
		}
		System.out.println(str);
		
	}
}