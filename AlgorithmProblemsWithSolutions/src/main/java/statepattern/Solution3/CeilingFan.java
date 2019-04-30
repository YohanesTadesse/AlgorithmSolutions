package statepattern.Solution3;


public class CeilingFan {

    final State defaultState = new DefaultState(this);
    final State lowState = new LowState(this);
    final State mediumState = new MediumState(this);
    public State highState = new HighState(this);
    State currentState = defaultState;

    public State up() {
        currentState.green();
        return currentState;
    }
}
