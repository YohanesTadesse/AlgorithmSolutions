package statepattern.hundreddoorsIII;

import java.util.ArrayList;
import java.util.List;

public class Context {

    final List<Doors> doors = new ArrayList<>();

    void createAllDoors(final int size) {
        for (int i = 0; i < size; i++) {
            doors.add(new Doors());
        }
    }


    public void handle(final int index) {

        for (int i = 1; i <= index; i++) {
            visit(index);
        }

    }

    private void visit(final int index) {
        for (int i = index - 1; i < doors.size();) {
            doors.get(i).handle();
            i += index;
        }
    }
}
