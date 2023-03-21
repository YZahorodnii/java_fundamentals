import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int currentValue = 0;
        int[] arr = {2, 44, 1, 66, 33, 22};
        for (int i = 1; i < arr.length; i++) {
            currentValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentValue) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }
        System.out.print(Arrays.toString(arr));
    }
}
