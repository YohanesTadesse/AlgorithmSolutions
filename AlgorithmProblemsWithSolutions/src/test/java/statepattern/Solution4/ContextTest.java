package statepattern.Solution4;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ContextTest {

    @Test
    public void shouldReturnInstanceOfDefaultSpeedAtStart() {
        final Context fan = new Context();

        final State state = fan.currentState;

        assertThat(state instanceof DefaultSpeed, is(true));
    }

    @Test
    public void shouldReturnInstanceOfLowSpeedWhileCallingGreenOnce() {
        final Context fan = new Context();

        fan.green();

        final State state = fan.currentState;

        assertThat(state instanceof LowSpeed, is(true));
    }

    @Test
    public void shouldReturnInstanceOfMediumCallingGreenTwice() {
        final Context fan = new Context();

        fan.green();
        fan.green();

        final State state = fan.currentState;

        assertThat(state instanceof MediumSpeed, is(true));

    }

    @Test
    public void shouldReturnInstanceOfHighSpeedCallingGreenThreeTimes() {
        final Context fan = new Context();

        fan.green();
        fan.green();
        fan.green();
        final State state = fan.currentState;

        assertThat(state instanceof HighSpeed, is(true));
    }

    @Test
    public void shouldReturnInstanceOfHighSpeedCallingGreen4timesShouldResetIt() {
        final Context fan = new Context();

        fan.green();
        fan.green();
        fan.green();
        fan.green();
        final State state = fan.currentState;

        assertThat(state instanceof DefaultSpeed, is(true));
    }
}
