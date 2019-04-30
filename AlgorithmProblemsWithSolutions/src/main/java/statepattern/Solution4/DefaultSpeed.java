package statepattern.Solution4;

    public class DefaultSpeed implements State {
    final Context fan;

    public DefaultSpeed(final Context fan) {
        this.fan = fan;
    }

    @Override
    public void green() {
        fan.currentState = fan.lowSpeed;
    }
}
