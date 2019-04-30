package statepattern.Solution4;

public class LowSpeed implements State {
    final Context fan;
    public LowSpeed(final Context context) {
        this.fan = context;
    }

    @Override
    public void green() {
      fan.currentState = fan.mediumSpeed;
    }
}
