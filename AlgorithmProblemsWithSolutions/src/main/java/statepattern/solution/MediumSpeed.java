package statepattern.solution;

public class MediumSpeed implements State{
	
	CeilingFan ceilingFan;
	MediumSpeed(CeilingFan ceilingFan){
		this.ceilingFan=ceilingFan;
	}
	@Override
	public void greenPulled() {
		System.out.println( "High speed" );
		ceilingFan.setCurrent_state(ceilingFan.getHighSpeed());
	}

	@Override
	public void redPulled() {
		System.out.println( "Low speed" );
		ceilingFan.setCurrent_state(ceilingFan.getLowSpeed());
	}

}
