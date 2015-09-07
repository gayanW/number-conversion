/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author chamara
 */
public class Model {
    private String decimal;
    private String binary;
    private String octal;
    private String hexaDecimal;

    public Model(String decimal, String binary, String octal, String hexaDecimal) {
        this.decimal = decimal;
        this.binary = binary;
        this.octal = octal;
        this.hexaDecimal = hexaDecimal;
    }

    /**
     * @return the decimal
     */
    public String getDecimal() {
        return decimal;
    }

    /**
     * 
     * @return the binary
     */
    public String getBinary() {
        return binary;
    }

    /**
     * @return the octal
     */
    public String getOctal() {
        return octal;
    }

    /**
     * Returns hexa decimal value.
     * @return String
     */
    public String getHexaDecimal() {
        return hexaDecimal;
    }
    

    
}
