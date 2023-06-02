package com.logicalPrgms;

public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Other methods and properties of the singleton class
    // ...
    
    public static void main(String[] args) {
	
    	Singleton s=new Singleton();
    	Singleton n = s.getInstance().instance;
    	System.out.println(n);
	}
}

