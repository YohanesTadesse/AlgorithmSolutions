package statepattern.HundreddorrsIV;

public class OpenState implements State {
    final Door door;

    public OpenState(final Door door) {
        this.door = door;
    }

    @Override
    public void handle() {
        door.currentState = door.closedState;
    }
}
