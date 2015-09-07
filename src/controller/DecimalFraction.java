package controller;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DecimalFraction {

	public static String toBinary(String strVal) {
		int n = 10; 
		BigDecimal bd = new BigDecimal(strVal);
		BigDecimal mult = new BigDecimal(2).pow(n);
		bd = bd.multiply(mult);
		BigInteger bi = bd.toBigInteger();
		StringBuilder str = new StringBuilder(bi.toString(2));
		while (str.length() < n + 1) {
			str.insert(0, "0");
		}
		str.insert(str.length() - n, ".");
		return str.toString();
	}

	public static String toHex(String str) {
		String whole = str.substring(0, str.indexOf('.'));
		String fraction = str.substring(str.indexOf('.'));
		String wholeHex = Integer.toHexString(Integer.parseInt(whole));
		String fractionHex = toHexFraction(Double.parseDouble(fraction));
		return wholeHex + fractionHex;
	}

	private static String toHexFraction(double hf) {
		String digits = "0123456789ABCDEF";
		String hex = new String(".");
		int count = 0;
		while (count < 10) {
			hf = hf * 16;
			hex += String.valueOf(digits.charAt((int) hf));
			hf = hf - (int) hf;
			if (hf == 0.0)
				break;
			count++;
		}
		return hex;
	}

	public static String toOctal(String value) {
		String whole = value.substring(0, value.indexOf('.'));
		String fraction = value.substring(value.indexOf('.'));
		String wholeOct = Integer.toOctalString(Integer.parseInt(whole));
		String fractionOct = toOctalFraction(Double.parseDouble(fraction));
		return wholeOct + fractionOct;
	}

	private static String toOctalFraction(double of) {
		String oct = new String(".");
		int count = 0;
		while (count < 10) {
			of = of * 8;
			oct += (int) of;
			of = of - (int) of;
			if (of == 0.0)
				break;
			count++;
		}
		return oct;
	}
}
