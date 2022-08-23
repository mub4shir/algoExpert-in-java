import java.util.Arrays;

// O(nlog(n)) time | O(1) space
public class NonConstructibleChange {
    public static void main(String[] args) {
        var coins = new int[]{5, 7, 1, 1, 2, 3, 22};
        System.out.println(nonConstructibleChange(coins));
    }

    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int currentChangeCreated = 0;
        for (int coin : coins) {
            if (coin > currentChangeCreated + 1) return currentChangeCreated + 1;
            currentChangeCreated += coin;

        }
        return currentChangeCreated + 1;
    }
}
