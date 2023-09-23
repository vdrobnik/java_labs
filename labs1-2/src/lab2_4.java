import java.util.Arrays;
/*4. Задача: Повернуть массив на 90 градусов по часовой стрелке.
Условие: Напишите метод, который принимает двумерный массив и возвращает новый массив,
полученный путем поворота исходного массива на 90 градусов по часовой стрелке.*/
public class lab2_4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedArray = rotate(array);

        System.out.println("Rotated Array: ");
        for (int[] row : rotatedArray) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] rotate(int[][] array) {
        int n = array.length;
        int[][] rotatedArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedArray[i][j] = array[n - j - 1][i];
            }
        }

        return rotatedArray;
    }
}
