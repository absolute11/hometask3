import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        // Удаление отрицательных чисел
        intList.removeIf(x -> x <= 0);

        // Удаление нечетных чисел
        intList.removeIf(x -> x % 2 != 0);

        // Сортировка списка
        Collections.sort(intList);

        // Вывод элементов
        System.out.println(intList);
    }
}