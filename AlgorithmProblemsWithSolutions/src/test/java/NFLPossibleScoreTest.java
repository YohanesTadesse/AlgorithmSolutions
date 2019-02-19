import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;


class NFLPossibleScoreTest {

    @Test
    void getNFLPossibleScoreCombo() {
        final NFLPossibleScore nflPossibleScore = new NFLPossibleScore();

        final List<Integer> possibleScores = Arrays.asList(3, 6);
        final List<Integer> possibleAddOn = Arrays.asList(0, 1, 2);
        int sum = 0;
        int target = 10;
        Set<List<Integer>> result = nflPossibleScore.getScoreCombo2(possibleScores, possibleAddOn, sum, target, new ArrayList<>());
        assertThat(result.size(), is(2));
        for (List<Integer> score : result){
            assertThat(score, containsInAnyOrder(3, 6, 1));
        }
    }

    @Test
    void name() {
    }
}