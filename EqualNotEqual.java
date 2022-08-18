public class EqualNotEqual {
	public static void main(String[] args) {   
		
		// Equals and Not Equals 等于和不等于
		
		int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        
        /*
         * create a variable called differentLength that stores the result of checking
         * whether the two album lengths are not the same. 
         */
        boolean differentLength = albumLengthA != albumLengthB;

        //if two variables are equal, we can use ==
        double paycheckAmount = 620;
        double calculatedPaycheck = 15.50 * 40;
        System.out.print(paycheckAmount == calculatedPaycheck);
        // This will print true, since paycheckAmount equals calculatedPaycheck
    
        //if two variables are not equal, we can use !=
        double balance = 20000.0;
        double amountToDeposit = 620;
        double updatedBalance = balance + amountToDeposit;
    
        boolean balanceHasChanged = balance != updatedBalance;
        // balanceHasChanged holds true, since balance does not equal updatedBalance
        //balanceHasChanged 成立，因为 balance does 不等于 updatebalance
	}
}