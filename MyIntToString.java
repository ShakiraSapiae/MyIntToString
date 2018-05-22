//class name
public class MyIntToString {
	// main function
	public static void main(String[] args) {
		// start to code //the title
		System.out.println("Java code to convert int to string \n");
		// return an empty string if value is negative.
		System.out
				.println(" Answer MyIntToString(-254, -16) return \"empty string\" : "
						+ MyIntToString(-254, -16) + "\n");
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
		// switch (numbase) {
		if (numbase > 0) {
			// if the numbase is positif

			// for storing remainder
			int rem;
			// for storing result
			String str = "";

			int num = value;
			// number system
			char cha[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'A', 'B', 'C', 'D', 'E', 'F' };
			// make sure the value is positive
			while (num > 0) {
				// remind to calculate the value
				rem = num % numbase;
				// continue calculate until the result is zero
				str = cha[rem] + str;
				// the value is divide by the base number
				num = num / numbase;
			}
			// hold the answer for this case
			Answer = str;

		} else
			Answer = " nooo ";
		// return the answer to the respective constructor
		return Answer;
	}
}
