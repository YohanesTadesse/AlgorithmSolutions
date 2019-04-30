package statepattern.Solution4;

public class Context {



    State highSpeed = new HighSpeed(this);
    State lowSpeed = new LowSpeed(this);
    State mediumSpeed = new MediumSpeed(this);
    State defaultSpeed = new DefaultSpeed(this);
    public State currentState = defaultSpeed;


    public void green() {
        this.currentState.green();
    }
}
