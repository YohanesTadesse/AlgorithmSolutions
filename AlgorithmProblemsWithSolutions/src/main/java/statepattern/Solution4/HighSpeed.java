package statepattern.Solution4;

public class HighSpeed implements State {
    final Context fan;

    public HighSpeed(final Context fan) {
        this.fan = fan;
    }

    @Override
    public void green() {
        fan.currentState = fan.defaultSpeed;
    }
}
