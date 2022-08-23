import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TournamentWinner {
    public static void main(String[] args) {
        List<List<String>> competitions = new ArrayList<>();
        competitions.add(Arrays.asList("HTML", "C#"));
        competitions.add(Arrays.asList("C#", "Python"));
        competitions.add(Arrays.asList("Python", "HTML"));
        List<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
        System.out.println(tournamentWinner(competitions, results));
    }

    // O(n) time | O(k) space, where n is number of competitions and k is the number of teams competing in these competitions
    public static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        HashMap<String, Integer> points = new HashMap<>();
        String winner = "";
        points.put(winner, 0);
        for (int i = 0; i < competitions.size(); i++) {
            String currentWinner = results.get(i) == 0 ? competitions.get(i).get(1) : competitions.get(i).get(0);
            points.put(currentWinner, points.getOrDefault(currentWinner, 0) + 3);
            if (points.get(winner) <= points.get(currentWinner)) winner = currentWinner;
        }
        return winner;
    }
}

