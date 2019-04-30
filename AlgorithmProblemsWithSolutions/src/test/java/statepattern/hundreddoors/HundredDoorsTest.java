package statepattern.hundreddoors;

import org.junit.Test;


public class HundredDoorsTest {

    @Test
    public void shou() {
        final HundredDoors doors = new HundredDoors();
        doors.populateAllDoors();
        doors.openCloseDoors();
    }

    @Test
    public void name() {
        final HundredDoors doors = new HundredDoors();

        doors.hundreds();
    }
}