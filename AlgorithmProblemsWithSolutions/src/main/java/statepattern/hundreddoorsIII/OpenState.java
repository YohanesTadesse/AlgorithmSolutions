package statepattern.hundreddoorsIII;

public class OpenState implements OpenCloseState {
    final Doors door;

    public OpenState(final Doors context) {
        this.door = context;
    }

    @Override
    public void handle() {
        door.currentState = door.closeState;
    }
}
