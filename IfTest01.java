public class IfTest01{
	public static void main(String[] args){
		
		/*
		int a = 10;
		int b = 2;

		if(a < b){
			System.out.println(a + "<" + b);
		}

		
		if(a < b){
			System.out.println(a + "<" + b);
		}else{
			System.out.println(a + ">=" + b);
		}

		
		if(a <= b){
			System.out.println(a + "<=" + b);
		}else{
			System.out.println(a + ">" + b);
		}

		
		if(a + b > 100){
			System.out.println(a + b + ">" + 100);
			System.out.println("a=" + a + "+" + "100" + "=" + (a + 100));
			System.out.println("b=" + b + "+" + "100" + "=" + (b + 100));
		}else if(a + b > 50){
			System.out.println(a + b + ">" + 50);
			a = a - 50;
			System.out.println("a=" + a);
		}else if(a + b > 30){
			System.out.println(a + b + ">" + 50);
			a = a -10;
			System.out.println("a=" + a);
		}else{
			System.out.println(a + b + "< 30");
		}
		*/
		boolean sex = false;
		if (sex){
			System.out.println("1");
		}else{
			System.out.println("2");
		}
		sex = true;
		System.out.println(sex ? "1": "2");




	}
}