package statepattern.solution;
public class CeilingFan {
	private State offState = new OffState(this);
	private State lowSpeed = new LowSpeed(this);
	private State highSpeed = new HighSpeed(this);
	private State mediumSpeed = new MediumSpeed(this);
	private State current_state = offState;
	
	public State getCurrent_state() {
		return current_state;
	}
	public void setCurrent_state(State current_state) {
		this.current_state = current_state;
	}
	public State getOffState() {
		return offState;
	}
	public State getLowSpeed() {
		return lowSpeed;
	}
	public State getHighSpeed() {
		return highSpeed;
	}
	public State getMediumSpeed() {
		return mediumSpeed;
	}
	public void pullgreen(){
		current_state.greenPulled();
	}
	public void pullred(){
		current_state.redPulled();
	}
}