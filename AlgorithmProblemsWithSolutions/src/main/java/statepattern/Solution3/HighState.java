package statepattern.Solution3;

public class HighState implements State {
    final CeilingFan fan;

    public HighState(final CeilingFan ceilingFan) {

        this.fan = ceilingFan;
    }

    @Override
    public void green() {
        fan.currentState = fan.defaultState;
    }
}
