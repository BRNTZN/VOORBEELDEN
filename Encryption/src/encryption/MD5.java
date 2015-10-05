package encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	public static void main(String[] args) {

		String string = "paswoord";

		byte[] bytesOfMessage = string.getBytes();

		MessageDigest md;
		byte[] md5;
		try {
			md = MessageDigest.getInstance("MD5");
			md5 = md.digest(bytesOfMessage);
			
			if (md.digest("paswoord".getBytes()).equals(md5)) {
				System.out.println("Same hash?");
			}
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
