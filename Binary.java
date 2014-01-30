/**
 * 
 * @author Jose Torres Velasco
 * 
 * This class allow work with binary strings and make type conversions.
 */
public class Binary {


	/**
	 *Converts an Integer value to a String that contains the binary 
	 *representation of introduced value.
	 *
	 * @param Integer to convert
	 * @return Binary string
	 */
	public static String integerToBitsString(int integer) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < 32; i++) {
			result.append(((integer >>> (32 - i - 1)) & 1));
		}
		return result.toString();
	}

	/**
	 *Converts an Byte value to a String that contains the binary 
	 *representation of introduced value.
	 *
	 * @param Byte to convert
	 * @return Binary string
	 */
	public static String byteToBitsString(byte b) {

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			result.append(((b >>> (8 - i - 1)) & 1));
		}
		return result.toString();
	}

	/**
	 *Converts a binary string to his integer value.
	 *
	 * @param Binary string to convert
	 * @return Integer value.
	 */
	public static int bitsStringToInteger(String bits) {

		int result = 0;

		if (bits.length() > 32) {
			throw new RuntimeException(
					"Number introduced can't be longer than 32 bits");
		} else {
			for (int i = 0; i < bits.length(); i++) {
				result <<= 1;
				if (bits.charAt(i) != '0' && bits.charAt(i) != '1') {
					throw new RuntimeException(
							"Input string only can content 0 or 1");
				} else {
					if (bits.charAt(i) == '1') {
						result |= 1;
					}
				}

			}

		}

		return result;
	}
	
	/**
	 *Converts a binary string to his byte value.
	 *
	 * @param Binary string to convert
	 * @return Integer value.
	 */
	public static byte bitsStringToByte(String bits) {

		byte result = 0;

		if (bits.length() > 8) {
			throw new RuntimeException(
					"Number introduced can't be longer than 8 bits");
		} else {
			for (int i = 0; i < bits.length(); i++) {
				result <<= 1;
				if (bits.charAt(i) != '0' && bits.charAt(i) != '1') {
					throw new RuntimeException(
							"Input string only can content 0 or 1");
				} else {
					if (bits.charAt(i) == '1') {
						result |= 1;
					}
				}

			}

		}

		return result;
	}

}
