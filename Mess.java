public class Mess {
	public static void main(String[] args) { 
		//Static Checking 静态检查
		//Static typing helps because bugs are caught during programming rather than during execution of the code.
		
		//String year = 2001;
		//incompatible types: int cannot be converted to String
		int year = 2001;
		System.out.println(year);
		
		//double title = "Shrek";
		//incompatible types: String cannot be converted to double
	    String title = "Shrek";
	    System.out.println(title);
	    
        //int genre = 'C';
        //incompatible types: char cannot be converted to int
	    char genre = 'C';
	    System.out.println(genre);
	    
        //boolean runtime = 1.58;
        //incompatible types: double cannot be converted to boolean
	    double runtime = 1.58;
	    System.out.println(runtime);
	    
        //char isPG = true;
        //incompatible types: boolean cannot be converted to char
	    boolean isPG = true;
	    System.out.println(isPG);
	}
}