package ChainOfResponsibilities;

public class LowEvaluator implements StateEvaluator {
    StateEvaluator nextState;

    @Override
    public String evaluate(final int input) {
        if (input == 1)
            return "Fan is Low";
        return nextState.evaluate(input);
    }

    @Override
    public void setNext(final StateEvaluator nextState) {
        this.nextState = nextState;
    }
}
