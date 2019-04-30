package statepattern.hundreddoorsIII;

public class Doors {
    OpenCloseState closeState = new ClosedState(this);
    OpenCloseState openState = new OpenState(this);
    OpenCloseState currentState = closeState;

    public void handle() {

        currentState.handle();
    }
}
