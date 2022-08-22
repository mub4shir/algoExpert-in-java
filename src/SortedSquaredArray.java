import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        var arr = new int[]{-7, -5, -4, 3, 6, 8, 9};
        System.out.println(Arrays.toString(sortedSquaredArray1(arr)));

    }

    // O(nlog(n)) time | O(n) space
    private static int[] sortedSquaredArray1(int[] arr) {
        var res = new int[arr.length];
        int i = 0;
        for (int x : arr)
            res[i++] = x * x;
        Arrays.sort(res);
        return res;
    }

    // O(n) time | O(n) space
    private static int[] sortedSquaredArray(int[] arr) {
        var res = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        for (int i = res.length - 1; i >= 0; i--) {
            if (Math.abs(arr[end]) > Math.abs(arr[start])) {
                res[i] = arr[end] * arr[end];
                end--;
            } else {
                res[i] = arr[start] * arr[start];
                start++;
            }
        }
        return res;

    }

}
