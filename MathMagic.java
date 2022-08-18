public class MathMagic {
	public static void main(String[] args) {

    int myNumber = 11;
    // myNumber is the original number
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree +17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);

    int myNumber1 = 7;
    int magicNumber = myNumber1 * myNumber1;
    magicNumber += myNumber1;
    magicNumber /= myNumber1;
    magicNumber += 17;
    magicNumber -= myNumber1;
    magicNumber /= 6;
    System.out.println(magicNumber);
    
    /*
     * Suppose myNumber is x:
     * ( ( ( x² + x ) / x ) + 17 - x ) / 6
     * = ( ( x + 1 ) + 17 - x ) / 6
     * = ( x + 18 - x ) / 6
     * = 18 / 6
     * =3
     */

	}
}