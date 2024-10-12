package dev.omedia.section6.exc27;

public class DiagonalStar {
    private static final String STAR = "*";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        printSquareStar(9);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            if (row == 1 || row == number) {
                System.out.println(new String(new char[number]).replace("\0", STAR));
                if (row == number) break;
            } else {
                System.out.print(STAR);
                for (int col = 2; col < number; col++) {
                    if ((col == row) || (number - col + 1 == row)) {
                        System.out.print(STAR);
                    } else {
                        System.out.print(SPACE);
                    }
                }
                System.out.println(STAR);
            }
        }
    }

}

