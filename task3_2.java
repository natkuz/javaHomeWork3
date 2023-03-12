import java.util.ArrayList;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class task3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        sc.close();
        ArrayList<Integer> arr = getArray(size);
        System.out.println(arr);
        arr = delEvenNumbers(arr);
        System.out.println(arr);
    }
    
    public static ArrayList<Integer> getArray(int size) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add((int) (Math.random() * 100));
        }
        return arr;
    }

    public static ArrayList<Integer> delEvenNumbers(ArrayList<Integer> arr) {
        for (int i = arr.size()-1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        return arr;
    }
}