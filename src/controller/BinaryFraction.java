package controller;

public class BinaryFraction {
	public static Double toDec(String binaryStr) {
		int placesAfterPoint = binaryStr.length() - binaryStr.indexOf(".") - 1;
		long numerator = Long.parseLong(binaryStr.replace(".", ""), 2);
		double value = ((double) numerator) / ( 1L << placesAfterPoint );
		
		return value;
	}

}
