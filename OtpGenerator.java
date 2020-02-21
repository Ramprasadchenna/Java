package chocky;

public class OtpGenerator {

	public static void main(String[] args) {
	System.out.println(generateOTP() );

	}
	private static int generateOTP() {
		int otp=(int)(Math.random()*1000000) ;
		return otp;
	}

}
