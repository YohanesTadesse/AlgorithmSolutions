package statepattern;

public class CeilingFan {

    int currentState = 0;
    public void pullgreen() {
        if (currentState == 0) {
            currentState = 1;
            System.out.println( "low speed" );
        } else if (currentState == 1) {
            currentState = 2;
            System.out.println( "medium speed" );
        } else if (currentState == 2) {
            currentState = 3;
            System.out.println( "high speed" );
        } else {
            currentState = 0;
            System.out.println( "turning off" );
        }
    }

    public void pullred() {
        if (currentState == 0) {
            currentState = 3;
            System.out.println( "high speed" );
        } else if (currentState == 1) {
            currentState = 0;
            System.out.println( "turning off" );
        } else if (currentState == 2) {
            currentState = 1;
            System.out.println( "low speed" );
        } else {
            currentState = 2;
            System.out.println( "medium speed" );
        }
    }
}
