package com.calculator.utilities;

public class Calculation {

    public static float x = 0, y = 0;
    public boolean x_set = false; 
    
    public static float division() {
        try {
            return x / y;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static float division(float x, float y) {
        try {
            return x / y;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static float multiplication() {
        return x * y;
    }

    public static float multiplication(float x, float y) {
        return x * y;
    }

    public static float addition() {
        return x + y;
    }

    public static float addition(float x, float y) {
        return x + y;
    }

    public static float subtraction() {
        return x - y;
    }
    
    public static float subtraction(float x, float y) {
        return x - y;
    }
}
