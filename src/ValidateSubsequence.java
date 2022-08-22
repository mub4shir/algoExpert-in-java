public class ValidateSubsequence {
    public static void main(String[] args) {
        var array = new int[]{5, 1, 22, 25, 6, -1, 10};
        var sequence = new int[]{1, 6, -1, 10};
        System.out.println(validateSubsequence(array, sequence));
    }

    // O(n) time | O(1) space
    private static boolean validateSubsequence(int[] array, int[] sequence) {
        var arrIdx = 0;
        var seqIdx = 0;
        while (arrIdx < array.length && seqIdx < sequence.length) {
            if (array[arrIdx] == sequence[seqIdx]) seqIdx++;
            arrIdx++;
        }
        return seqIdx == sequence.length;
    }

    // O(n) time | O(1) space
    private static boolean validateSubsequence2(int[] array, int[] sequence) {
        var seqIdx = 0;
        for (var value : array) {
            if (seqIdx == sequence.length) break;
            if (sequence[seqIdx] == value) seqIdx++;
        }
        return seqIdx == sequence.length;
    }
}

