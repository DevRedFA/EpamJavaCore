package com.epam.hw2;

class MathOperations {
    //    enum operations {SUM, DIV, SUB, MUL}
    static String[] operations = new String[]{"SUM", "DIV", "SUB", "MUL"};

    static double calculate(String op, double a, double b) {
        double result;
        switch (op) {
            case "SUB":
                result = (a - b);
                break;
            case "DIV":
                result = (a / b);
                break;
            case "MUL":
                result = (a * b);
                break;
            case "SUM":
                result = (a + b);
                break;
            default:
                result = Double.NaN;
                break;
        }
        return result;
    }
}
