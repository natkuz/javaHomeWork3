import java.util.ArrayList;
import java.util.Collections;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

public class task3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        System.out.println(numbers);
        System.out.printf("Максимальный элемент: %d \n", Collections.max(numbers));
        System.out.printf("Минимальный элемент: %d \n", Collections.min(numbers));
        System.out.printf("Среднее арифметическое: %.2f", average(numbers));
    }

    public static double average(ArrayList<Integer> arr) {
        double res = 0;
        for (int item: arr) {
            res += item;
        }
        double average = res / arr.size();
        return average;
    }
    
}