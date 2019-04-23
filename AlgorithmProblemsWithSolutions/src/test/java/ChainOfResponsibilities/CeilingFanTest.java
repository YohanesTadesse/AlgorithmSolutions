package ChainOfResponsibilities;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CeilingFanTest {

    @Test
    public void callingGreenOnceShouldReturnLow() {
        final CeilingFan fan = new CeilingFan();
        final String expected = "Fan is Low";

        final String actual = fan.green();

        assertThat(actual, is(expected));

    }

    @Test
    public void callingGreenTwiceShouldReturnMedium() {
        final CeilingFan fan = new CeilingFan();
        final String expected = "Fan is Medium";

        fan.green();
        final String actual = fan.green();

        assertThat(actual, is(expected));
    }

    @Test
    public void callingGreenTwiceShouldReturnHigh() {
        final CeilingFan fan = new CeilingFan();
        final String expected = "Fan is High";

        fan.green();
        fan.green();
        final String actual = fan.green();

        assertThat(expected, is(actual));
    }

    @Test
    public void callingGreenThreeTimesShouldReturnOFF() {
        final CeilingFan fan = new CeilingFan();
        final String expected = "Fan is Off";

        fan.green();
        fan.green();
        fan.green();
        final String actual = fan.green();

        assertThat(expected, is(actual));
    }

    @Test
    public void callingRedOnceShouldGiveReturnHigh() {
        final CeilingFan fan = new CeilingFan();
        final String expected = "Fan is High";

        final String actual = fan.red();

        assertThat(expected, is(actual));
    }

    @Test
    public void callingRedAfterTwoGreenShouldReturnMedium() {
        final CeilingFan fan = new CeilingFan();
        final String expected = "Fan is Medium";

        fan.green();
        fan.green();
        fan.green();
        final String actual = fan.red();

        assertThat(expected, is(actual));
    }
}
