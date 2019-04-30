package statepattern.Solution3;

public class MediumState implements State {
    final CeilingFan fan;

    public MediumState(final CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void green() {
        fan.currentState = fan.highState;
    }
}
