package controller;

public class HexaDecimalFraction {
	public static String toDec(String hexDecStr) {
		String whole = hexDecStr.substring(0, hexDecStr.indexOf('.'));
		String fraction = hexDecStr.substring(hexDecStr.indexOf('.') + 1);
		
		double wholeDec = Integer.parseInt(whole, 16);
		double fractionDec = fractionPartToDec(fraction);
		
		return String.valueOf(wholeDec + fractionDec);
	}
	
	private static Double fractionPartToDec(String hexFraction) {
		String digits = "0123456789ABCDEF";
        hexFraction = hexFraction.toUpperCase();
        double val = 0;
        double pow = -1;
        for (int i = 0; i < hexFraction.length(); i++) {
            char c = hexFraction.charAt(i);
            int d = digits.indexOf(c);
            val += d * Math.pow(16, pow--);
        }
        return val;
	}

}
