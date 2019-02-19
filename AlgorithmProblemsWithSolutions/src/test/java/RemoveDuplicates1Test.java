import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class RemoveDuplicates1Test {

    @Test
    public void shouldRemoveDuplicates() {
        final RemoveDuplicates1 dedup = new RemoveDuplicates1();
        final int result = dedup.removeDuplicatesSolution(new int[]{1, 2, 3, 1, 2, 4});
        assertThat(result, is(4));
    }
}