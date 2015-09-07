/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Model;

/**
 *
 * @author chamara
 */
public class Controller {
	model.Model numberModel;

	// Values that create the numberModel
	private String decimal;
	private String binary;
	private String octal;
	private String hexaDecimal;

	// Number systems
	public static final int DECIMAL = 10;
	public static final int OCTAL = 8;
	public static final int BINARY = 2;
	public static final int HEXA_DECIMAL = 16;

	/*
	 * Returns a new NumberModel object from the value provided.
	 */
	public Model getNumberModel(String strVal, int valueType) throws NumberFormatException {
		
		if (isFractionNumber(strVal)) {

		switch (valueType) {
		case DECIMAL:
			this.decimal = strVal;
			this.binary = DecimalFraction.toBinary(strVal);
			this.hexaDecimal = DecimalFraction.toHex(strVal);
			this.octal = DecimalFraction.toOctal(strVal);
			break;

		case BINARY:
			this.binary = strVal;
			Double doubleVal = BinaryFraction.toDec(strVal);
			this.decimal = Double.toString(doubleVal);
			this.octal = DecimalFraction.toOctal(decimal);
			this.hexaDecimal = DecimalFraction.toHex(decimal);
			break;
		
		case OCTAL:
			this.octal = strVal;
			this.decimal = Double.toString(OctalFraction.toDec(strVal));
			this.hexaDecimal = DecimalFraction.toHex(decimal);
			this.binary = DecimalFraction.toBinary(decimal);
			break;
			
		case HEXA_DECIMAL:
			this.hexaDecimal = strVal;
			this.decimal = HexaDecimalFraction.toDec(strVal);
			this.binary = DecimalFraction.toBinary(decimal);
			this.octal = DecimalFraction.toOctal(decimal);
			break;
		}
			
		} else { // if the value is an Integer
				int intVal = Integer.parseInt(strVal, valueType);
				this.decimal = Integer.toString(intVal);
				this.binary = Integer.toBinaryString(intVal);
				this.octal = Integer.toOctalString(intVal);
				this.hexaDecimal = Integer.toHexString(intVal);
		} 

		return new Model(this.decimal, this.binary, this.octal,
				this.hexaDecimal);
	}

	private boolean isFractionNumber(String strVal) {
		// if contains a decimal point
		if (strVal.indexOf(".") != -1)
			return true;
		return false;
	}
}
