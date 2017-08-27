package com.epam.hw2;

import java.util.Scanner;

public class Calc {
    private static boolean test = false;

    static void setTest() {
        test = true;
    }

    public static void main(String[] args) {
        System.out.println("������, � �����������");
        Scanner sc = new Scanner(System.in);
        String del = " ";
        if (test) sc.useDelimiter(del);
        String op;
        boolean correct = false;
        do {
            System.out.println("�������� �������� ��������: SUM/DIV/SUB/MUL");
            op = sc.next();
            for (String s : MathOperations.operations) {
                if (s.equals(op)) {
                    correct = true;
                }
            }
        } while (!correct);

        System.out.println("������� ������ �����");

        double a = getData(sc);
        System.out.println("������� ������ �����");
        double b = getData(sc);

        double result = MathOperations.calculate(op, a, b);

        ConsoleGraphics.printInConsoleGraph(String.valueOf(result));
    }

    private static double getData(Scanner sc) {
        boolean correct = false;
        double a = Double.NaN;
        do {
            if (sc.hasNextDouble()) {
                a = sc.nextDouble();
                correct = true;
            } else {
                sc.next();
                System.out.println("������� ���������� �����");
            }
        } while (!correct);
        return a;
    }
}
