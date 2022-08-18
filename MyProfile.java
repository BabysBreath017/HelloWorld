public class MyProfile {
	//Static typing, which is one of the safety features of Java.
	public static void main(String[] args) {   
    //String, which stores multiple characters using double quotes.
    String name = "Maria";
    
    //int, which stores whole numbers.
    int age = 24;
    
    //double, which stores bigger whole numbers and decimal numbers.
    double desiredSalary = 9000.00;
    
    //char, which stores single characters using single quotes.
    char gender = 'f';
    
    //boolean, which stores true and false
    boolean lookingForJob = true;
    
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("desiredSalary: " + desiredSalary);
        //desiredSalary 期望薪水
        System.out.println("gender: " + gender);
        System.out.println("lookingForJob: " + lookingForJob);
	}
}