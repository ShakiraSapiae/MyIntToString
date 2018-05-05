//class name
public class MyIntToString {
	// main function
	public static void main(String[] args) {
		// start to code //the title
		System.out.println("Java code to convert int to string \n");
		// return an empty string if value is negative.
		System.out
				.println(" Answer MyIntToString(-254, 16) return \"empty string\" : "
						+ MyIntToString(-254, 16) + "\n");
		// return an empty string if the conversion fails
		System.out
				.println(" Answer MyIntToString(0, 16) return \"empty string\" : "
						+ MyIntToString(0, 16) + "\n");
		// return the proper string of the value using character '0' to '9' and
		// 'A' to 'F'
		System.out.println(" Answer MyIntToString(254, 16) return \"FE\" : "
				+ MyIntToString(254, 16) + "\n");
		System.out.println(" Answer MyIntToString(254, 8) return \"376\"  : "
				+ MyIntToString(254, 8) + "\n");
		System.out
				.println(" Answer MyIntToString(254, 2) return \"11111110\" : "
						+ MyIntToString(254, 2) + "\n");
	}

	// start the switch-case code to calculate the integer
	public static String MyIntToString(int value, int numbase) {
		// hold the answer in String
		String Answer;
		// using numbase to calculate
		switch (numbase) {
		// if the numbase is 16
		case 16:
			// for storing remainder
			int remHex;
			// for storing result
			String strHex = "";
			// the value is hexnum in this case
			int hexnum = value;
			// digits in hexadecimal number system
			char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'A', 'B', 'C', 'D', 'E', 'F' };
			// make sure the value is positive
			while (hexnum > 0) {
				// remind to calculate the value for hexadecimal
				remHex = hexnum % 16;
				// continue calculate until the result is zero
				strHex = hex[remHex] + strHex;
				// the value is divide by 16
				hexnum = hexnum / 16;
			}
			// hold the answer for this case
			Answer = strHex;
			// continue for another case
			break;
		// is the numbase is 8
		case 8:
			// for storing reminder
			int remOct;
			// for storing result
			String strOct = "";
			// the value now is octnum
			int octnum = value;
			// digits in octal decimal numbers
			char oct[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
			// make sure the value is positif
			while (octnum > 0) {
				// remind to calculate the value for octal decimal
				remOct = octnum % 8;
				// continue calculate until the result is zero
				strOct = oct[remOct] + strOct;
				// the value is divide by 8
				octnum = octnum / 8;
			}
			// hold the answer for this case
			Answer = strOct;
			// continue for another case
			break;
		// if numbase is 2
		case 2:
			// for storing reminder
			int remBin;
			// for storing answer
			String strBin = "";
			// the value is now binnum
			int binnum = value;
			// digits in binary numbers
			char bin[] = { '0', '1' };
			// make sure the value is positif
			while (binnum > 0) {
				// remind to calculate for binary number
				remBin = binnum % 2;
				// continue calculate until the result is zero
				strBin = bin[remBin] + strBin;
				// the value is divide by 2
				binnum = binnum / 2;
			}
			// hold the answer for this case
			Answer = strBin;
			// continue for another case
			break;
		// if the numbase is not on the case, it will be default
		default:
			// hold an empty string as answer
			Answer = "  ";
			// end of default case
			break;
		}
		// return the answer to the respective constructor
		return Answer;
	}
}
