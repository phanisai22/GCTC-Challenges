package com.mile1.Exception;

public class NullNameException extends Exception{
    private static final long serialVersionUID = 1L;

    public NullNameException(){
    }

    @Override
    public String toString() {
        return "name is null";
    }

}
