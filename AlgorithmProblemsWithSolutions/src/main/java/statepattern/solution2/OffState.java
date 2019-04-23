package statepattern.solution2;

public class OffState implements State {
    CeilingFan fan;
    public OffState(final CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void red() {
        fan.currentState = fan.highState;
    }

    @Override
    public void green() {
        fan.currentState = fan.lowState;
    }
}
