import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SensorInAHallWay {
    public boolean isThereAPath(final List<Sensor1> sensors, final double random) {
        if (random > 0) {
            if (!sensors.isEmpty() && random == sensors.get(0).r)
                return false;
            return true;
        }

        final Map<Character, Character> map = new HashMap<>();
        map.put('(', '(');
        map.put(')', ')');
        map.put('-', '-');
        final char[] chs = new char[]{'(', ')', '-'};
        final StringBuilder stb = new StringBuilder();

        for (Map.Entry<Character, Character> entry : map.entrySet()
             ) {

        }

//        final List<Character> chars = map.values().collect(Collectors.toList());

        return false;
    }
}

class Sensor1 {
    final double x;
    final double y;
    final double r;

    Sensor1(final double x, final double y, final double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}
