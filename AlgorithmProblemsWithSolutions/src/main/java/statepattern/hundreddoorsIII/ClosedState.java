package statepattern.hundreddoorsIII;


public class ClosedState implements OpenCloseState {

    final Doors door;

    public ClosedState(final Doors door) {
        this.door = door;
    }

    @Override
    public void handle() {
        door.currentState = door.openState;
    }
}
