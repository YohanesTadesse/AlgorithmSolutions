package statepattern.solution2;

public class CeilingFan {
    public CeilingFan() {
    }

    State offState = new OffState(this);
    State lowState = new LowState(this);
    State mediumState = new MediumState(this);
    State highState = new HighState(this);
    State currentState = offState;

    final void green() {
        currentState.green();
    }

    final void red() {
        currentState.red();
    }

}
