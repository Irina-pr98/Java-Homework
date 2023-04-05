import java.util.Arrays;
import java.util.Random;

// (Дополнительное) Реализовать алгоритм сортировки слиянием

public class first_task {
    public static void mergeSort(int[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            int mid = array.length / 2;
            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid, array.length);
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(array, leftArray, rightArray);
        }
    }
    
    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j])
                array[k++] = leftArray[i++];
            else
                array[k++] = rightArray[j++];
            
        }
        while (i < leftArray.length)
            array[k++] = leftArray[i++];
        
        while (j < rightArray.length)
            array[k++] = rightArray[j++];
        
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(100);
    
        System.out.println("Начальный массив: " + Arrays.toString(array));
        mergeSort(array);
        System.out.println("Конечный массив: " + Arrays.toString(array));
    }
}
