package statepattern.solution2;

public class MediumState implements State {
    final CeilingFan fan;

    public MediumState(final CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void red() {
        fan.currentState = fan.lowState;
    }

    @Override
    public void green() {
        fan.currentState = fan.highState;
    }
}
