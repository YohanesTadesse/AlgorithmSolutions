package statepattern.hundreddoors;

import java.util.ArrayList;
import java.util.List;

public class HundredDoors {
    final static List<Door> doorList = new ArrayList<>();

    void populateAllDoors() {
        for (int i = 0; i < 100; i++) {
            doorList.add(new Door(i + 1));
        }
    }

    void openCloseDoors() {
        for (int i = 1; i < 100; i++) {
            visitDoor(i);
        }
        for (int i = 0; i < doorList.size(); i++) {
            System.out.println(doorList.get(i).printStatus());
        }

    }

    void visitDoor(final int index) {
        for (int i = index - 1; i < 100;) {
            doorList.get(i).flipStatus();
            i += index;
        }
    }

    void hundreds() {
        int j = 1;
        for (int i = 1; i <= 100; i++) {
            if (j * j == i) {
                j++;
                System.out.println("The door number " + i + " is Opened");
            } else {
                System.out.println("The door number " + i + " is Closed");
            }
        }
    }
}
