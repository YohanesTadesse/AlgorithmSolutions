package statepattern.hundreddoors;

public class Door {
    final int doorNumber;
    boolean open = false;

    public Door(final int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void flipStatus() {
        open = !open;
    }

    public String printStatus() {
        final StringBuilder sb = new StringBuilder("The door number " + doorNumber + " is");
        sb.append(open? " Opened" : " Closed");
        return sb.toString();
    }
}
