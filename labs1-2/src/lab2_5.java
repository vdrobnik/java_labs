import java.util.HashMap;
import java.util.Map;
/*Задача: Найти пару элементов в массиве, сумма которых равна заданному числу.
Условие: Напишите метод, который принимает массив целых чисел и целое число target и
возвращает пару элементов массива, сумма которых равна target.
Если такая пара не существует, метод должен вернуть null.*/
public class lab2_5 {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 11, 15};
        int target = 9;

        int[] pair = findTwoSum(array, target);
        if (pair != null)
            System.out.println("Pair: " + pair[0] + ", " + pair[1]);
        else
            System.out.println("Pair not found");
    }
    public static int[] findTwoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if (map.containsKey(complement))
                return new int[]{map.get(complement), i};
            map.put(array[i], i);
        }
        return null;
    }
}