package statepattern.solution;

public class LowSpeed implements State {
	CeilingFan ceilingFan;
	LowSpeed(CeilingFan ceilingFan){
		this.ceilingFan=ceilingFan;
	}

	@Override
	public void greenPulled() {
		System.out.println( "medium speed" ); 
		ceilingFan.setCurrent_state(ceilingFan.getMediumSpeed());
	}

	@Override
	public void redPulled() {
		System.out.println( "turning off" ); 
		ceilingFan.setCurrent_state(ceilingFan.getOffState());
	}

}
