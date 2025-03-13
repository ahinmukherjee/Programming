public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 34, 5, 67, 89, 1};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
