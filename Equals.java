public class Equals {
  	public static void main(String[] args){
  		
  		// .equals() 互相比较是否相等
  		
  		String person1 = "Paul";
  		String person2 = "John";
  		String person3 = "Paul";
  		 
  		System.out.println(person1.equals(person2));
  		// Prints false, since "Paul" is not "John"
  		 
  		System.out.println(person1.equals(person3));
  		// Prints true, since "Paul" is "Paul"
  		
  		String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        System.out.println(line1.equals(line2));
        System.out.println(line2.equals(line3));
    }       
}
