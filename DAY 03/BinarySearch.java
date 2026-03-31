import java.util.Arrays;
import java.util.Random;

class BinarySearch {
    static int binarySearch(int[] array, int num, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == num) {
            return mid;
        } else if (num < array[mid]) {
            return binarySearch(array, num, left, mid - 1);
        } else {
            return binarySearch(array, num, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        long start_time = System.nanoTime();
        Random random = new Random();
        int[] arr = new int[500];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        Arrays.sort(arr);

        int target = arr[random.nextInt(arr.length)];

        int index = binarySearch(arr, target, 0, arr.length - 1);

        if (index != -1) {
            System.out.println("Found " + target + " at index " + index);
        } else {
            System.out.println("Number not found");
        }

        System.out.println("Time: " + (end_time - start_time) + "ns");
    }
}