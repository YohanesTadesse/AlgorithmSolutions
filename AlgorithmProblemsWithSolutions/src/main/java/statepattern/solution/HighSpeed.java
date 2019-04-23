package statepattern.solution;

public class HighSpeed implements State{
	CeilingFan ceilingFan;
	HighSpeed(CeilingFan ceilingFan){
		this.ceilingFan=ceilingFan;
	}
	@Override
	public void greenPulled() {
		System.out.println( "Turnning off" );
		ceilingFan.setCurrent_state(ceilingFan.getOffState());
	}

	@Override
	public void redPulled() {
		System.out.println( "Medium speed" );
		ceilingFan.setCurrent_state(ceilingFan.getMediumSpeed());
	}

}
