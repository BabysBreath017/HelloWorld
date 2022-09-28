public class DoWhileTest{
	public static void main(String[] args){
		int i =0;
		do{
			System.out.println(++i);
		}
		while (i < 10);


		java.util.Scanner s = new java.util.Scanner(System.in);
		String username;
		String password;
		do{
			System.out.println("用户名：");
			username = s.next();
			System.out.println("密码：");
			password = s.next();
		}while(!username.equals("admin") || !password.equals("123"));
		System.out.println("登录成功，欢迎" + username + "回来！");

	}
}