package controller;

public class OctalFraction {

	public static Double toDec(String octalStr) {
		int placesAfterPoint = octalStr.length() - octalStr.indexOf(".") - 1;
		long numerator = Long.parseLong(octalStr.replace(".", ""), 8);
		double value = ((double) numerator) / Math.pow(8, placesAfterPoint);
		
		return value;
	}
}
