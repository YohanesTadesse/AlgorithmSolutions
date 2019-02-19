import java.util.List;

/*
* given list of Sensors in which are configured in a hallway can you find a path to pass through with out detected by the sensors
* the sensors has a range of radius coverage and a point in the hallway where they are configured plus the width of the hall way is given
*
* provide a solution to find if there is a path on the hallway to pass undetected
* given List<Sensor> sensors and double hallWayWidth
*
*
* the solution I have provided will take a O(n*n)
* */

public class SensorsInHallWay {

    public boolean isThereAPath(final List<Sensor> sensors, final double width) {
        for (int i = 0; i < sensors.size() - 1; i++) {
            if (isSensorBlocker(sensors.get(i), width))
                return false;
            for (int j = 1; j < sensors.size(); j++) {
                if (isSensorsIntersect(sensors.get(i), sensors.get(j), width))
                    if (isSensorBlocker(sensors.get(i), sensors.get(j), width))
                        return false;
            }
        }
        return true;
    }

    private boolean isSensorsIntersect(final Sensor sensor1, final Sensor sensor2, final double width) {
        final double distance = (sensor1.getX() - sensor2.getX()) + (sensor1.getY() - sensor2.getY());
        return distance < (sensor1.getRadius() + sensor2.getRadius());
    }

    private boolean isSensorBlocker(final Sensor sensor, final double width) {
        final double top = sensor.getY() + sensor.getRadius();
        final double bottom = Math.abs(sensor.getY() - sensor.getRadius());
        return (top + bottom > width);
    }

    private boolean isSensorBlocker(final Sensor sensor, final Sensor sensor2, final double width) {
        final double top1 = sensor.getY() + sensor.getRadius();
        final double bottom1 = sensor.getY() - sensor.getRadius();
        final double top2 = sensor2.getY() + sensor2.getRadius();
        final double bottom2 = sensor2.getY() - sensor2.getRadius();
        final double top = Math.max(top1, top2);
        final double bottom = Math.min(bottom1, bottom2);
        return (top + bottom > width);
    }

}


class Sensor {
    final double x;
    final double y;
    final double radius;

    Sensor(final double x, final double y, final double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
