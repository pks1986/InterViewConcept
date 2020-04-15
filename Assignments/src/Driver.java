import java.util.regex.Pattern;

class CaesarCipher {

	// encrypt method
	public static String encrypt(String text, int key) {

		String ret = "";
		char ch;

		for (int i = 0; i < text.length(); ++i) {
			ch = text.charAt(i);
			ch = (char) (ch + key);
			ret += ch;
		}

		return ret;

	}

	// decrypt method
	public static String decrypt(String text, int key) {

		String ret = "";
		char ch;

		for (int i = 0; i < text.length(); ++i) {
			ch = text.charAt(i);
			ch = (char) (ch - key);
			ret += ch;
		}
		return ret;
	}
}

public class Driver {

	public static void testEncrypt(String stringToEncrypt) throws Exception {

		if (containsInvalidCharacter(stringToEncrypt)) {
			throw new Exception("Cannot encrypt as string contains an invalid character");
		} else {
			System.out.println(CaesarCipher.encrypt(stringToEncrypt, 7));
		}
	}

	public static void testDecrypt(String stringToDecrypt) throws Exception {
		if (containsInvalidCharacter(stringToDecrypt)) {
			throw new Exception("Cannot decrypt as string contains an invalid character");
		} else {
			System.out.println(CaesarCipher.encrypt(stringToDecrypt, 7));
		}
		System.out.println(CaesarCipher.decrypt(stringToDecrypt, 7));
	}

	public static boolean containsInvalidCharacter(String str) {
		// Here [^\\S ] represent any character with escape sequence except S
		// for Space.
		// ^ is used to represent that this will not be used, means negation
		// operation.
		Pattern patternSpecialChar = Pattern.compile("[^\\S ]");

		if (patternSpecialChar.matcher(str).find()) {
			System.out.println("\nContain special character");
			return true;
		}

		// POSIX for printable character is \p{Print}.
		// Here negation( ^ ) indicates that it will check for non-printable
		// character
		Pattern patternNonPrintableChar = Pattern.compile("[^\\p{Print}]");
		if (patternNonPrintableChar.matcher(str).find()) {
			System.out.println("\nContain non printable character");
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		//Valid character's Test with no exception
		String validStringToEncrypt = "Hello young fellow.";
		String validStringToDecrypt = "Olssv'!v|un'mlssv~5";

		try {
			testEncrypt(validStringToEncrypt);
			testDecrypt(validStringToDecrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		//Invalid Character's Test with exception
		
		// The first character is non-printable character
		String inValidStringToEncrypt = " Hello young fellow.";
		// The first character is special character
		String inValidStringToDecrypt = "\n Olssv'!v|un'mlssv~5";

		try {
			testEncrypt(inValidStringToEncrypt);
			testDecrypt(inValidStringToDecrypt);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
