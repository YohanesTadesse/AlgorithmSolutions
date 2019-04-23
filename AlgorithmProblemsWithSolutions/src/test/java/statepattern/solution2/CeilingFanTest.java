package statepattern.solution2;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CeilingFanTest {

    @Test
    public void shouldHaveStateOff() {
        final CeilingFan fan = new CeilingFan();

        assertThat(fan.currentState instanceof OffState, is(true));
    }

    @Test
    void shouldStateBeLowCallingOneGreen() {
        final CeilingFan fan = new CeilingFan();

        fan.green();

        assertThat(fan.currentState instanceof LowState, is(true));
    }

    @Test
    void shouldBeMediumCallingTwoGreen() {
        final CeilingFan fan = new CeilingFan();

        fan.green();
        fan.green();

        assertThat(fan.currentState instanceof MediumState, is(true));
    }

    @Test
    void shouldBeHighCallingThreeGreens() {
        final CeilingFan fan = new CeilingFan();

        fan.green();
        fan.green();
        fan.green();

        assertThat(fan.currentState instanceof HighState, is(true));
    }

    @Test
    void shouldBeHighCallingRedOnce() {
        final CeilingFan fan = new CeilingFan();

        fan.red();

        assertThat(fan.currentState instanceof HighState, is(true));
    }

    @Test
    void shouldBeMediumCallingRedTwice() {
        final CeilingFan fan = new CeilingFan();

        fan.red();
        fan.red();

        assertThat(fan.currentState instanceof MediumState, is(true));
    }

    @Test
    void shouldBeLowCallingRedTheeTimes() {
        final CeilingFan fan = new CeilingFan();

        fan.red();
        fan.red();
        fan.red();

        assertThat(fan.currentState instanceof LowState, is(true));
    }

}
