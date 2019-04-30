package statepattern.hundreddoorsIII;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DoorsTest {

    @Test
    public void shouldReturnAllClosed() {
        final Doors doors = new Doors();
        assertThat(doors.currentState instanceof ClosedState, is(true));
    }

    @Test
    public void shouldReturnAllOpen() {
        final Doors doors = new Doors();
        doors.handle();
        assertThat(doors.currentState instanceof OpenState, is(true));

    }

    @Test
    public void shouldReturn100AllOpen() {
        final Context context = new Context();
        context.createAllDoors(100);

        context.doors.forEach(
                x-> assertThat(x.currentState instanceof ClosedState, is(true))
        );
    }

    @Test
    public void shouldReturnAllEvensClosedAndAllEvensOpen() {

        final Context context = new Context();
        context.createAllDoors(100);

        context.handle(1);

        context.doors.forEach(x-> assertThat(x.currentState instanceof OpenState, is(true)));
    }

    @Test
    public void shouldReturnEvenNumbersClosedForTwoOpenCloses() {
        final Context context = new Context();
        context.createAllDoors(100);
        context.handle(2);

        for (int i = 0; i < 100; ) {
            assertThat(context.doors.get(i).currentState instanceof ClosedState, is(true));

            i += 2;
        }
    }
}