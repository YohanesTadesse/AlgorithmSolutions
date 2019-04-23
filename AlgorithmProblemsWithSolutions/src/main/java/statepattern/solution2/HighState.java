package statepattern.solution2;

public class HighState implements State {
    final CeilingFan fan;
    public HighState(final CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void red() {
        fan.currentState = fan.mediumState;
    }

    @Override
    public void green() {
        fan.currentState = fan.offState;
    }
}
