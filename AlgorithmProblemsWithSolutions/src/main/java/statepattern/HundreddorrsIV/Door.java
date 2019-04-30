package statepattern.HundreddorrsIV;

public class Door {
    public State closedState = new ClosedState(this);
    State openState = new OpenState(this);
    State currentState = closedState;

    public void handle() {
        currentState.handle();
    }
}
