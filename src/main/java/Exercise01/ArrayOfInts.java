package Exercise01;

import java.util.Arrays;

public class ArrayOfInts {

    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if (arrayOfInts == null || arrayOfInts.length == 0) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        reverse(copy);
        return sumOfInts(Arrays.copyOf(copy, x));
    }

    private static void reverse(int[] input) {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0; i <= middle; i++) {
            int temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}