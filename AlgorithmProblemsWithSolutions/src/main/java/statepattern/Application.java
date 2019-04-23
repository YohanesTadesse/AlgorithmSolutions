package statepattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();

        while (true) {
            final String userInput = new Scanner(System.in).nextLine();
            if (userInput.equals("+")) {
                fan.pullgreen();
            } else if ("-".equals(userInput)) {
                fan.pullred();
            } else {
                break;
            }
        }
    }
}