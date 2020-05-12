/**
 * 
 */
package sendotpsms;

import java.util.SplittableRandom;

/**
 * @author pradeep gupta
 *
 */
public class SendOtpSMS {

	public static void main(String[] args) {

		String otp = SendOtpSMS.generateOtp(5);
		System.out.println("Generated Otp = " + otp);
	}

	private static String generateOtp(int otpLength) {
		// Java 8 = SplittableRandom
		SplittableRandom splittableRandom = new SplittableRandom();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < otpLength; i++){
			sb.append(splittableRandom.nextInt(0, 10));
		}
			

		return sb.toString();
	}

}
