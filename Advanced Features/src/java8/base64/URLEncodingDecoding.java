package java8.base64;

import java.util.Base64;

public class URLEncodingDecoding {

	public static void main(String[] args) {
		String url = "http://www.google.co.in";
		Base64.Encoder urlEncoder = Base64.getUrlEncoder();
		Base64.Decoder urlDecoder = Base64.getUrlDecoder();
		
		String encodedUrl = urlEncoder.encodeToString(url.getBytes());
		String decodedUrl = new String(urlDecoder.decode(encodedUrl));
		
		System.out.println("\nActual String: " + url
				+ "\nEncoded String: " + encodedUrl
				+ "\nDecoded String: " + decodedUrl);

	}

}
