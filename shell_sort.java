import java.util.Arrays;

public class shell_sort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        for (int gap = length/2; gap >= 1; gap = gap/2) {
            for (int j = gap; j < length; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (array[i+gap] > array[i]) {
                        break;
                    }else {
                        int tmp = array[i];
                        array[i] = array[i+gap];
                        array[i+gap] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
