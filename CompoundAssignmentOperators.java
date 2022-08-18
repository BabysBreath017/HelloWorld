public class CompoundAssignmentOperators {
	public static void main(String[] args) {   
		int numCookies = 17;
        /*
         * Addition (+=)
         * Subtraction (-=)
         * Multiplication (*=)
         * Division (/=)
         * Modulo (%=)
         */
        numCookies += 3;
        numCookies -= 2;
        numCookies *= 2;
        numCookies /= 2;
        numCookies %= 4;
       
            System.out.println(numCookies);
	}
}