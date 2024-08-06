package gustavo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 80, 30, 70, 40, 50, 90};

        int[] quick = quickSort(array);
        System.out.println(Arrays.toString(quick));
    }

    public static int[] quickSort(int[] array) {
        if (array.length <= 1) return array;

        int pivot = array[array.length / 2];
        int[] greater = new int[0];
        int[] smaller = new int[0];

        for (int i = 0; i < array.length; i++) {
            if (i == array.length/2) continue;
            if (array[i] >= pivot) {
                greater = addElementEnd(greater, array[i]);
            } else {
                smaller = addElementEnd(smaller, array[i]);
            }
        }

        greater = quickSort(greater);
        smaller = quickSort(smaller);

        int[] result = new int[greater.length + smaller.length + 1];

        for (int i = 0; i < smaller.length; i++) {
            result[i] = smaller[i];
        }
        result[smaller.length] = pivot;
        for (int i = 0; i < greater.length; i++) {
            result[smaller.length + 1 + i] = greater[i];
        }

        return result;
    }

    public static int[] addElementEnd(int[] array, int element) {
        int[] array2 = Arrays.copyOf(array, array.length + 1);
        array2[array.length] = element;
        return array2;
    }
}
