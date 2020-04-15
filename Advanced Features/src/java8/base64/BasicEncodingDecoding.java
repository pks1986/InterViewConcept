package java8.base64;

import java.util.Base64;

public class BasicEncodingDecoding {

	public static void main(String[] args) {
		
		
		// encoding byte array  
		byte byteArr1[] = {1, 2};
		Base64.Encoder encoder = Base64.getEncoder();
		System.out.println("Encoded Arr: " + encoder.encode(byteArr1));
		
		byte byteArr2[] = new byte[5];
		int length = encoder.encode(byteArr1, byteArr2);
		System.out.println("\nNew Encoded Byte: " + byteArr2);
		System.out.println("Length of new Encoded Byte: " + length);
		
		//Encoding String
		Base64.Decoder decoder = Base64.getDecoder();
		String str = "Rakesh Yadav";
		String encodedString = encoder.encodeToString(str.getBytes());
		String decodedString = new String(decoder.decode(encodedString));
		
		System.out.println("\nActual String: " + str
				+ "\nEncoded String: " + encoder.encodeToString(str.getBytes())
				+ "\nDecoded String: " + decodedString);
		

	}

}
