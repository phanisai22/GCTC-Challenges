package org.collection.list.restrictdatatype;

/**
 * Class allows data which is a strictly a number (integer, float, double, etc).
 * 
 * @author Phani Sai
 * @version 1.0
 */

public class Numbers {

    int intN;
    float floatN;
    double doubleN;

    /**
     * Constructor for int datatype.
     * @param data
     */
    public Numbers(int data) {
        this.intN = data;
        System.out.println("Integer");
    }

    /**
     * Constructor for float datatype.
     * @param data
     */
    public Numbers(float data) {
        this.floatN = data;
        System.out.println("Float");
    }

    /**
     * Constructor for double datatype.
     * @param data
     */
    public Numbers(double data) {
        this.doubleN = data;
        System.out.println("Double");
    }
}
