package com.epam.hw2;

class ConsoleGraphics {
    private static char[][] ZERO = new char[][]{{'X', 'X', 'X'},
            {'X', ' ', 'X'},
            {'X', ' ', 'X'},
            {'X', ' ', 'X'},
            {'X', 'X', 'X'}};

    private static char[][] ONE = new char[][]{{' ', 'X', ' '},
            {' ', 'X', ' '},
            {' ', 'X', ' '},
            {' ', 'X', ' '},
            {' ', 'X', ' '}};

    private static char[][] TWO = new char[][]{{'X', 'X', 'X'},
            {' ', ' ', 'X'},
            {'X', 'X', 'X'},
            {'X', ' ', ' '},
            {'X', 'X', 'X'}};

    private static char[][] THREE = new char[][]{{'X', 'X', 'X'},
            {' ', ' ', 'X'},
            {'X', 'X', 'X'},
            {' ', ' ', 'X'},
            {'X', 'X', 'X'}};

    private static char[][] FOUR = new char[][]{{'X', ' ', 'X'},
            {'X', ' ', 'X'},
            {'X', 'X', 'X'},
            {' ', ' ', 'X'},
            {' ', ' ', 'X'}};

    private static char[][] FIVE = new char[][]{{'X', 'X', 'X'},
            {'X', ' ', ' '},
            {'X', 'X', 'X'},
            {' ', ' ', 'X'},
            {'X', 'X', 'X'}};

    private static char[][] SIX = new char[][]{{'X', 'X', 'X'},
            {'X', ' ', ' '},
            {'X', 'X', 'X'},
            {'X', ' ', 'X'},
            {'X', 'X', 'X'}};

    private static char[][] SEVEN = new char[][]{{'X', 'X', 'X'},
            {' ', ' ', 'X'},
            {' ', 'X', ' '},
            {' ', 'X', ' '},
            {' ', 'X', ' '}};

    private static char[][] EIGHT = new char[][]{{'X', 'X', 'X'},
            {'X', ' ', 'X'},
            {'X', 'X', 'X'},
            {'X', ' ', 'X'},
            {'X', 'X', 'X'}};

    private static char[][] NINE = new char[][]{{'X', 'X', 'X'},
            {'X', ' ', 'X'},
            {'X', 'X', 'X'},
            {' ', ' ', 'X'},
            {'X', 'X', 'X'}};

    private static char[][] SPOT = new char[][]{{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', 'X', ' '}};

    private static char[][] MINUS = new char[][]{{' ', ' ', ' '},
            {' ', ' ', ' '},
            {'X', 'X', 'X'},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    private static final char[][] POS_INFINITY = new char[][]{{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X'},
            {'X', ' ', ' ', 'X', 'X', ' ', ' ', 'X'},
            {'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

    private static final char[][] NEG_INFINITY = new char[][]{{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X'},
            {'X', 'X', 'X', ' ', 'X', ' ', ' ', 'X', 'X', ' ', ' ', 'X'},
            {' ', ' ', ' ', ' ', 'X', 'X', 'X', ' ', ' ', 'X', 'X', 'X'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};


    static void printInConsoleGraph(String s) {
        char[][][] chars = parseToChars(s);
        if (chars.length > 0) {
            for (int j = 0; j < chars[0].length; j++) {
                for (char[][] aChar : chars) {
                    printLine(aChar, j);
                }
                System.out.println("");
            }
        } else {
            System.err.println("Переданы ошибочные параметры функции printInConsoleGraph: " + s);
        }
    }

    private static char[][][] parseToChars(String s) {
        char[][][] chars;
        if ("-Infinity".equals(s)) {
            chars = new char[1][NEG_INFINITY.length][NEG_INFINITY[0].length];
            chars[0] = NEG_INFINITY;
        } else {
            if ("Infinity".equals(s)) {
                chars = new char[1][POS_INFINITY.length][POS_INFINITY[0].length];
                chars[0] = POS_INFINITY;
            } else {

                chars = new char[s.length()][5][3];
                char[] c = s.toCharArray();
                for (int i = 0; i < c.length; i++) {
                    switch (c[i]) {
                        case '0':
                            chars[i] = ZERO;
                            break;
                        case '1':
                            chars[i] = ONE;
                            break;
                        case '2':
                            chars[i] = TWO;
                            break;
                        case '3':
                            chars[i] = THREE;
                            break;
                        case '4':
                            chars[i] = FOUR;
                            break;
                        case '5':
                            chars[i] = FIVE;
                            break;
                        case '6':
                            chars[i] = SIX;
                            break;
                        case '7':
                            chars[i] = SEVEN;
                            break;
                        case '8':
                            chars[i] = EIGHT;
                            break;
                        case '9':
                            chars[i] = NINE;
                            break;
                        case '.':
                            chars[i] = SPOT;
                            break;
                        case '-':
                            chars[i] = MINUS;
                            break;
                        default:
                            System.err.println("Переданы ошибочные параметры функции printInConsoleGraph: " + s);
                            break;
                    }
                }
            }
        }
        return chars;
    }

    private static void printLine(char[][] a, int i) {
        for (int k = 0; k < a[0].length; k++)
            System.out.print(a[i][k]);
        System.out.print(" ");
    }
}
