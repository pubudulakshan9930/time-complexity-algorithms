import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        System.out.println("Algorithm: Binary Search");
        System.out.println("Input Size | Time (ns)");
        System.out.println("-----------------------");

        for (int size : sizes) {
            int[] arr = new java.util.Random().ints(size, 0, 10000).toArray();
            Arrays.sort(arr);
            int target = arr[size - 1];

            long start = System.nanoTime();
            binarySearch(arr, target);
            long end = System.nanoTime();

            System.out.println(size + "        | " + (end - start));
        }
    }
}
