package app;

import java.util.Random;

public class HomeWorkLesson09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];
        int sumOfElementsInEvenRows = 0;
        int sumOfElementsInOddRows = 0;
        int sumOfRow0 = 0;
        int sumOfRow1 = 0;
        int sumOfRow2 = 0;
        int sumOfRow3 = 0;
        int column0Sum = 0;
        int column1Sum = 0;
        int column2Sum = 0;
        int column3Sum = 0;
        int sumOfDiagonal1 = 0;
        long productOfElementsInEvenColumns = 0;
        long productOfElementsInOddColumns = 0;
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(49) + 1;
                System.out.print(matrix[i][j] + " ");
                if (i % 2 == 0) {
                    sumOfElementsInEvenRows += matrix[i][j];
                } else {
                    sumOfElementsInOddRows += matrix[i][j];
                }

                if (j % 2 == 0) {
                    if ((i == 0) && (j == 0)) {
                        productOfElementsInEvenColumns = matrix[i][j];
                    } else {
                        productOfElementsInEvenColumns *= matrix[i][j];
                    }
                } else {
                    if ((i == 0) && (j == 1)) {
                        productOfElementsInOddColumns = matrix[i][j];
                    } else {
                        productOfElementsInOddColumns *= matrix[i][j];
                    }
                }
                if (i == 0) {
                    sumOfRow0 += matrix[i][j];
                } else if (i == 1) {
                    sumOfRow1 += matrix[i][j];
                } else if (i == 2) {
                    sumOfRow2 += matrix[i][j];
                } else {
                    sumOfRow3 += matrix[i][j];
                }

                if (j == 0) {
                    column0Sum += matrix[i][j];
                } else if (j == 1) {
                    column1Sum += matrix[i][j];
                } else if (j == 2) {
                    column2Sum += matrix[i][j];
                } else {
                    column3Sum += matrix[i][j];
                }

                if (i == j) {
                    sumOfDiagonal1 += matrix[i][j];
                }

                int sumOfDiagonal2 = matrix[0][3] + matrix[1][2] + matrix[2][1] + matrix[3][0];

            }
            System.out.println();

        }
        int sumOfDiagonal2 = matrix[0][3] + matrix[1][2] + matrix[2][1] + matrix[3][0];


        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sumOfElementsInEvenRows);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sumOfElementsInOddRows);
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + productOfElementsInEvenColumns);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + productOfElementsInOddColumns);
        if ((sumOfRow0 == sumOfRow1) && (sumOfRow1 == sumOfRow2)
                && (sumOfRow2 == sumOfRow3) && (column0Sum == column1Sum)
                && (column1Sum == column2Sum) && (column2Sum == column3Sum)
                && (column3Sum == sumOfDiagonal1) && (sumOfDiagonal1 == sumOfDiagonal2)) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }
    }
}
