package com.mile1.Exception;

public class NullStudentObjectException extends Exception{

    private static final long serialVersionUID = 1L;

    public NullStudentObjectException(){
    }

    @Override
    public String toString() {
        return "object is null";
    }
}
