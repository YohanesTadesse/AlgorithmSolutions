package statepattern.Solution4;

public class MediumSpeed implements State {
    final Context fan;
    public MediumSpeed(final Context context) {
        fan = context;
    }

    @Override
    public void green() {
        fan.currentState = fan.highSpeed;
    }
}
