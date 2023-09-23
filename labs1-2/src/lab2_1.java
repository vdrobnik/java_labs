import java.util.Arrays;
/*1. Задача: Найти наибольшую подстроку без повторяющихся символов.
Условие: Напишите метод, который принимает строку и возвращает
наибольшую подстроку, в которой все символы уникальны.*/
public class lab2_1 {
    public static String findLongestSubstring(String str) {
        int n = str.length();
        int maxLength = 0; // Длина наибольшей подстроки
        int start = 0; // Начальный индекс наибольшей подстроки
        // Создаем массив для хранения индексов символов
        int[] lastIndex = new int[128];
        Arrays.fill(lastIndex, -1);
        int i = 0;
        for (int j = 0; j < n; j++) {
            char currentChar = str.charAt(j);
            // Если символ уже встречался в подстроке, обновляем начальный индекс
            if (lastIndex[currentChar] != -1) {
                i = Math.max(lastIndex[currentChar] + 1, i);
            }
            // Обновляем длину наибольшей подстроки, если необходимо
            if (j - i + 1 > maxLength) {
                maxLength = j - i + 1;
                start = i;
            }
            // Записываем индекс текущего символа
            lastIndex[currentChar] = j;
        }
        // Возвращаем наибольшую подстроку без повторяющихся символов
        return str.substring(start, start + maxLength);
    }
    public static void main(String[] args) {
        String input = "abcabcbboqpuff";
        String longestSubstring = findLongestSubstring(input);
        System.out.println("Наибольшая подстрока без повторяющихся символов: " + longestSubstring);
    }
}