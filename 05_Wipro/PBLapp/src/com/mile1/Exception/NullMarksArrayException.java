package com.mile1.Exception;

public class NullMarksArrayException extends Exception{
    private static final long serialVersionUID = 1L;

    public NullMarksArrayException(){
    }

    @Override
    public String toString() {
        return "mark array is null";
    }
}
