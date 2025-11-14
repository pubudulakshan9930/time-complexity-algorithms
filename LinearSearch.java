public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        System.out.println("Algorithm: Linear Search");
        System.out.println("Input Size | Time (ns)");
        System.out.println("-----------------------");

        for (int size : sizes) {
            int[] arr = new java.util.Random().ints(size, 0, 10000).toArray();
            int target = arr[size - 1];

            long start = System.nanoTime();
            linearSearch(arr, target);
            long end = System.nanoTime();

            System.out.println(size + "        | " + (end - start));
        }
    }
}
