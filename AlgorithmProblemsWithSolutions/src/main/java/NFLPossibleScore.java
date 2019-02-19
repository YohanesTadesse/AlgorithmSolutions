import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
* given list of valid score points for the game and final score of one team, can you get all possible score points of the game
*
* lets say SeaHawk has score of 15 for the last night game and NFL game score system allow a 3 point, a 6 point, a 6 point and 1 extra, a 6 point and 2 other points extra
*
* the combination of final score might be => [3, 3, 3, 6],[3, 3, 3, 3, 3], [6, 6, 3], [6 & 1, 6 & 2]
* */
public class NFLPossibleScore {

    public Set<List<Integer>> getScoreCombo(final List<Integer> scores, final List<Integer> additional, final int sumInput, final  int target, final List<Integer> elements) {
        int sum = sumInput;
        final Set<List<Integer>> possibleSores = new HashSet<>();
        if (scores.isEmpty())
            return null;
        if (sum == target) {
            possibleSores.add(elements);
            return possibleSores;
        }

        final int prefix = scores.get(0);
        sum += prefix;
        final List<Integer> newScores = scores.subList(1, scores.size());
        final List<Integer> newElements = new ArrayList<>(elements);

        if (prefix == 6) {
            for (int i = 0; i < additional.size(); i++) {
                newElements.add(prefix);
                newElements.add(additional.get(i));
                final List<Integer> addOn = additional.subList(0, i);
                addOn.addAll(additional.subList(i + 1, additional.size()));
                possibleSores.addAll(getScoreCombo(newScores, addOn, sum, target, newElements));
            }
        } else {
            newElements.add(prefix);
            possibleSores.addAll(getScoreCombo(newScores, additional, sum, target, newElements));
        }

        return possibleSores;
    }


    public Set<List<Integer>> getScoreCombo2(final List<Integer> possibleMainScores, final List<Integer> possibleAddScore, final int sum, final int target, final List<Integer> listScoresOrderd) {
        final Set<List<Integer>> result = new HashSet<>();

        if (possibleMainScores.isEmpty() || sum > target) return new HashSet<>();
        if (sum == target) {
            result.add(listScoresOrderd);
            return result;
        }

        for (int i = 0; i < possibleMainScores.size(); i++) {
            final Integer weight = possibleMainScores.get(i);
            int newSum = sum + weight;
            final List<Integer> newLisScoreOrder = new ArrayList<>(listScoresOrderd);
            newLisScoreOrder.add(weight);
            if (weight == 6) {
                for (int j = 0; j < possibleAddScore.size(); j++) {
                    if (newSum > target) break;
                    newSum += possibleAddScore.get(j);
                    final List<Integer> newScoreListWithAdOns = new ArrayList<>(newLisScoreOrder);
                    newScoreListWithAdOns.add(possibleAddScore.get(j));
                    final Set<List<Integer>> scoreCombo2 = getScoreCombo2(possibleMainScores, possibleAddScore, newSum, target, newScoreListWithAdOns);
                    if (!scoreCombo2.isEmpty())
                        result.addAll(scoreCombo2);
                }
            }
            final Set<List<Integer>> scoreCombo2 = getScoreCombo2(possibleMainScores, possibleAddScore, newSum, target, newLisScoreOrder);
            if (!scoreCombo2.isEmpty())
                result.addAll(scoreCombo2);
        }
        return result;
    }
}
