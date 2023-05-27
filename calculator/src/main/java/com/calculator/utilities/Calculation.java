package com.calculator.utilities;

public class Calculation {

    public static float x = 0, y = 0;

    public static void resetVars() {
        x = 0;
        y = 0;
    }
    
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
}
