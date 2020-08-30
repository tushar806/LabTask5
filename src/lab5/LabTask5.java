/* Create by Intellij IDEA
 * Author: Tushar pal
 * roll no: 63
 * Date: 4/8/2020
 * File: LabTask5.java
 * Time:9:10PM
 */
// Create a program to create OTP(One-Time Password) for a customer service.
package lab5;

public class LabTask5 {
    private static final byte RANDOM_NUMBER_MAX_LIMIT = 10;
    /**
     * This method generate an OTP for the customer depending upon the number of digits.
     *
     * @return the generated OTP.
     */
    private static int generateOTP(){
        int numberOfDigitsInOTP = 6;
        int oneTimePassword = 0;
        for(int count = 0; count<numberOfDigitsInOTP;count++){
            int randomNumber = 0;
            randomNumber = createRandomNumber();
            int powerOf10 = (int) Math.pow(10,count);
            randomNumber = randomNumber * powerOf10;
            oneTimePassword = oneTimePassword + randomNumber;
        }
        return oneTimePassword;
    }
    /**
     * This method generates a random number between 0 and 9 for the OTP.
     *
     * @return a random number between 0 and 9.
     */
    private static int createRandomNumber(){
        return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
    }
    /**
     * This method prints the generated OTP with some dashes between the characters.
     *
     * @param generatedOTP the rando OTP generated from the generatedOTP method.
     */
    private static void printOTP(int generatedOTP){
        String otpString = String.valueOf(generatedOTP);
        for(int i=0; i<otpString.length(); i++){
            System.out.print(otpString.charAt(i) + (i<otpString.length()-1 ? "-" : ""));
        }
    }
    public static void main(String[] args){
        int generatedOTP = generateOTP();
        System.out.print("your OTP is: ");
        printOTP(generatedOTP);

    }
}
