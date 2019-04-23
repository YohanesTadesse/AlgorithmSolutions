package statepattern.solution;

public class OffState implements State {
	CeilingFan ceilingFan;

	OffState(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void greenPulled() {
		System.out.println( "low speed" );
		ceilingFan.setCurrent_state(ceilingFan.getLowSpeed());
	}

	@Override
	public void redPulled() {
		
	}

}
