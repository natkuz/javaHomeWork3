import java.util.Arrays;

// (Дополнительное) Реализовать алгоритм сортировки слиянием
// (Сначала делим список на кусочки (по 1 элементу), 
// затем сравниваем каждый элемент с соседним, сортируем и объединяем. 
// В итоге, все элементы отсортированы и объединены вместе.)

public class task3_1 {
    public static void main(String[] args) {
        int[] sortArr = {1, 3, 5, 12, 0, 6, 22, -3};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] arr) {
        int size = arr.length;
        if (size == 0) {
            return null;
        }
        if (size < 2) {
            return arr;
        }
        int middle = size / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[size - middle];
    
        for (int i = 0; i < middle; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = middle; i < size; i++) {
            rightArr[i - middle] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr, middle, size - middle);
        return arr;
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
        int i = 0; 
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            arr[k++] = leftArr[i++];
        }
        while (j < right) {
            arr[k++] = rightArr[j++];
        }
    }
}
