public class ForTest02{
	public static void main(String[] args){
		/*
		for (int i = 0;i < 10 ;i++ ){
			System.out.println("i =" +i);
		}
		for (int k = 0; k < 2; k++){
			System.out.println("k = "+ k);
		}
		*/
		int i = 0;
		for (int k = 0; k < 2; k++){
			for (;i < 10 ;i++ ){
				System.out.println("k...>"+ k);
				System.out.println("i --->" +i);
			}
		}
	}
}