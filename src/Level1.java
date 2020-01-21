import java.util.*;

public class Level1 {
    public static String MassVote(int N, int[] Votes) {
        int totalVotes = 0;
        int maxVotes = Votes[0];
        int countMaxVotes = 0;
        int numberMax = 0;
        double res = 0;
        for (int i = 0; i < N; i++) {
            totalVotes += Votes[i];
            if (Votes[i] >= maxVotes) {
                maxVotes = Votes[i];
                numberMax = i + 1;
            }
        }
        for (int i = 0; i < N; i++) {
            if (Votes[i] == maxVotes) countMaxVotes++;
        }
        if (countMaxVotes > 1) return "no winner";
        res = Math.floor((maxVotes * 100 / (double) totalVotes) * 100);
        res = res / 100;
        if (res >= 50.0) {
            return "majority winner " + numberMax;
        } else {
            return "minority winner " + numberMax;
        }
    }
}