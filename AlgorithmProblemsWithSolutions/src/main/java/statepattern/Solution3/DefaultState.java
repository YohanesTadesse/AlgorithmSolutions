package statepattern.Solution3;

public class DefaultState implements State {

    final CeilingFan fan;
    public DefaultState(final CeilingFan ceilingFan) {
        this.fan = ceilingFan;
    }

    @Override
    public void green() {
        fan.currentState = fan.lowState;
    }
}
