package statepattern.Solution3;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CeilingFanTest {

    @Test
    public void shouldReturnInstanceOfLowStateForOneUpOperation() {
        final CeilingFan fan = new CeilingFan();

        final State state = fan.up();

        assertThat(state instanceof LowState, is(true));
    }

    @Test
    public void shouldReturnInstanceOfMediumStateForTwoUpOperations() {
        final CeilingFan fan = new CeilingFan();

        fan.up();
        final State state = fan.up();

        assertThat(state instanceof MediumState, is(true));
    }

    @Test
    public void shouldReturnInstanceOfHighStateForThreeUpOperations() {
        final CeilingFan fan = new CeilingFan();

        fan.up();
        fan.up();
        final State state = fan.up();

        assertThat(state instanceof HighState, is(true));
    }

    @Test
    public void shouldReturnInstanceOfDefaultStateForFourUpOperations() {
        final CeilingFan fan = new CeilingFan();

        fan.up();
        fan.up();
        fan.up();
        final State state = fan.up();

        assertThat(state instanceof DefaultState, is(true));
    }

}