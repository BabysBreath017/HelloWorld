public class GreaterLessThan {
	public static void main(String[] args) {   
	    
		// Greater Than and Less Than 大于和小于
		
		double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        System.out.println(creditsEarned > creditsToGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        System.out.println(creditsToGraduate < creditsAfterSeminar);
        
        double balance = 20000.01;
        double amountToWithdraw = 5000.01;
        System.out.print(amountToWithdraw < balance);
        //this will print true, since amountToWithdraw is less than balance
        
        
        /*
         * double balance = 20000.01;
         * double balance = 20000.01;
         * double amountToWithdraw = 5000.01;
         * System.out.print(amountToWithdraw < balance);
         * this will print true, since amountToWithdraw is less than balance
         */
        
	}
}