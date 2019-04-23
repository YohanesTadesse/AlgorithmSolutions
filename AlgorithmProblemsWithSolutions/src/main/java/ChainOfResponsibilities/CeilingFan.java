package ChainOfResponsibilities;

public class CeilingFan {

    final StateEvaluator evaluator = Factory.create();

    int currentState = 0;

    String green() {
        increment();
        return getEvaluate();
    }

    String red() {
        decrement();
        return getEvaluate();

    }

    private String getEvaluate() {
        return evaluator.evaluate(currentState);
    }

    private void increment() {
        if (currentState == 3)
            currentState = 0;
        else
            currentState++;
    }

    private void decrement() {
        if (currentState == 0)
            currentState = 3;
        else
            currentState--;
    }


}
