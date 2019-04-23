
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SensorInAHallWayTest {

    @Test
    void shouldCreateInstance() {
        final SensorInAHallWay sensor = new SensorInAHallWay();
    }

    @Test
    void shouldReturnTrueForEmptyListAndWidthGreaterThanZero() {
        final SensorInAHallWay sensor = new SensorInAHallWay();
        final boolean isThereAPath = sensor.isThereAPath(new ArrayList<>(), Math.random());
        assertTrue(isThereAPath);
    }

    @Test
    void shouldReturnFalseWithLessThanOrEqualToZero() {
        final SensorInAHallWay sensor = new SensorInAHallWay();
        final boolean isThereAPath = sensor.isThereAPath(new ArrayList<>(), 0);
        assertFalse(isThereAPath);
    }

    @Test
    void sensorWithRadiusEqualToWidthShouldReturnFalse() {
        final Sensor1 s = new Sensor1(4, 2, 5);
        final SensorInAHallWay sensor = new SensorInAHallWay();
        final boolean isThereAPath = sensor.isThereAPath(Arrays.asList(s), 5);
        assertFalse(isThereAPath);
    }

    @Test
    void sensorWithTwiceRadiusLessThanWidthShouldReturnTrue() {
        final Sensor1 s = new Sensor1(4, 2, 5);
        final SensorInAHallWay sensor = new SensorInAHallWay();
        final boolean isThereAPath = sensor.isThereAPath(Arrays.asList(s), 6);
        assertTrue(isThereAPath);
    }

    @Test
    void shouldReturn() {
    }
}
