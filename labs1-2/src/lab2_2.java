import java.util.Arrays;
/*2. Задача: Объединить два отсортированнных массива.
Условие: Напишите метод, который принимает два отсортированных массива и возвращает новый массив,
содержащий все элементы из обоих массивов в отсортированном порядке.*/
public class lab2_2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        int i = 0, j = 0, k = 0;
        // Сравниваем элементы обоих массивов, добавляем наименьший в объединенный массив и увеличиваем соответствующий индекс.
        while (i < length1 && j < length2) {
            if (array1[i] < array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        // Если в первом массиве остались элементы, добавляем их в объединенный массив.
        while (i < length1) {
            mergedArray[k++] = array1[i++];
        }

        // Если во втором массиве остались элементы, добавляем они в объединенный массив.
        while (j < length2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}