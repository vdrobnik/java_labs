import java.util.Scanner;
/*Лабораторная 2: задачи 6-8
1. Метод sum вычисляет сумму всех элементов двумерного массива. Он проходит по каждому элементу
   и добавляет его значение к переменной sum. Возвращается сумма sum.
2. Метод findMaxElementsInRows находит максимальный элемент в каждой строке массива. Для каждой строки, проходим по элементам и находим максимальное значение. Максимальный элемент каждой строки сохраняется в массив maxElements, который затем возвращается.
3. Метод rotateArray поворачивает двумерный массив на 90 градусов против
*/

public class lab2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в двумерном массиве: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов в двумерном массиве: ");
        int columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Введите элементы двумерного массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Сумма всех элементов двумерного массива: " + sum(array));

        System.out.println("Максимальный элемент в каждой строке:");
        int[] maxElements = findMaxElementsInRows(array);
        for (int i = 0; i < maxElements.length; i++) {
            System.out.println("Строка " + i + ": " + maxElements[i]);
        }

        System.out.println("Повернутый двумерный массив:");
        int[][] rotatedArray = rotateArray(array);
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int sum(int[][] array) {
        int sum = 0;

        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }

        return sum;
    }

    public static int[] findMaxElementsInRows(int[][] array) {
        int[] maxElements = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int max = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxElements[i] = max;
        }

        return maxElements;
    }

    public static int[][] rotateArray(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] rotatedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rotatedArray[j][i] = array[i][columns - j - 1];
            }
        }

        return rotatedArray;
    }
}

