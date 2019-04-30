package statepattern.HundreddorrsIV;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class doorTest {

    @Test
    public void shouldCurrentStateOfDoorBeClosed() {
        final Door door = new Door();

        final State state = door.currentState;

        assertThat(state instanceof ClosedState, is(true));
    }

    @Test
    public void shouldReturnOpenStateInstanceOnceHandleIsCalled() {
        final Door door = new Door();

        door.handle();

        final State state = door.currentState;

        assertThat(state instanceof OpenState, is(true));
    }

    @Test
    public void shouldReturnClosedStateCallingHandleTwiceTimes() {
        final Door door = new Door();
        door.handle();
        door.handle();

        assertThat(door.currentState instanceof ClosedState, is(true));
    }

    @Test
    public void shouldAllBeInstanceOfOpenForHundredDoorsVisitingAllOnce() {
        final List<Door> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Door());
        }
        list.stream().peek(Door::handle).forEach(x-> assertThat(x.currentState instanceof OpenState, is(true)));
    }

    @Test
    public void shouldAllBeInOne() {
    }
}
