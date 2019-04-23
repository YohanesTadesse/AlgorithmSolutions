
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;


public class TddNFLTest {

    @Test
    void shouldBeValidClass() {
        final TddNFL tddNFL = new TddNFL();
        assertThat(tddNFL.getClass(), is(instanceOf(TddNFL.class)));
    }
}
