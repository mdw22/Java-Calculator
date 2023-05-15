package com.calculator.utilities;

public class Calculation {

    static private float x = 0, y = 0;

    public void set_X(float x) {
        this.x = x;
    }

    public void set_Y(float y) {
        this.y = y;
    }
    
    public static float division(float x, float y) {
        try {
            return x / y;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static float multiplication(float x, float y) {
        return x * y;
    }

    public static float addition(float x, float y) {
        return x + y;
    }

    public static float subtraction(float x, float y) {
        return x - y;
    }
}
