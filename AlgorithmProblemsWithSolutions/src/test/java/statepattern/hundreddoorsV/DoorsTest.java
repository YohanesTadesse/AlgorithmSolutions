package statepattern.hundreddoorsV;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DoorsTest {

    @Test
    public void shouldCurrentStateBeClosed() {
        // arrange
        final Door door = new Door();

        // act
        final iState currentState = door.getState();

        // assert
        assertThat(currentState instanceof ClosedState, is(true));

    }

    @Test
    public void shouldSwitchStateAfterVisiting() {
        // arrange
        final Door door = new Door();

        // act
        door.visit();

        // assert

        final iState currentState = door.getState();
        assertThat(currentState instanceof OpenState, is(true));

    }

    @Test
    public void shouldOpenCloseDoor() {
        // arrange
        final Door door = new Door();

        // act
        door.visit();
        door.visit();

        // assert

        final iState currentState = door.getState();
        assertThat(currentState instanceof ClosedState, is(true));

    }

    private class Door {
        public iState closedState = new ClosedState(this);
        iState currentState = closedState;
        iState openState = new OpenState(this);

        public iState getState() {

            return currentState;
        }

        public void visit() {
            currentState.visit();
        }
    }

    private interface iState {
        public void visit();
    }

    private class ClosedState implements iState {
        private final Door door;

        private ClosedState(final Door door) {
            this.door = door;
        }

        @Override
        public void visit() {
            door.currentState = door.openState;
        }
    }

    private class OpenState implements iState {
        private final Door door;

        private OpenState(final Door door) {
            this.door = door;
        }

        @Override
        public void visit() {
            door.currentState = door.closedState;

        }
    }
}
