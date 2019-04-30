package statepattern.HundreddorrsIV;

public class ClosedState implements State {
    final Door door;

    public ClosedState(final Door door) {
        this.door = door;
    }

    @Override
    public void handle() {
        door.currentState = door.openState;
    }
}
