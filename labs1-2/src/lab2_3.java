/*3. Задача: Найти максимальную сумму подмассива.
Условие: Напишите метод, который принимает массив целых чисел
и возвращает максимальную сумму подмассива (последовательных элементов).*/
//Алгоритм Кадане
public class lab2_3 {
    public static void main(String[] args) {
        int[] array = {1, -3, 2, 1, -1, 4, -2, 3};
        int maxSum = findMaxSubarraySum(array);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
    public static int findMaxSubarraySum(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];

        // Проходим по массиву, начиная со второго элемента
        for (int i = 1; i < array.length; i++) {
            // Если текущая сумма становится отрицательной, начинаем суммировать снова с текущего элемента
            currentSum = Math.max(array[i], currentSum + array[i]);
            // Обновляем максимальную сумму
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

