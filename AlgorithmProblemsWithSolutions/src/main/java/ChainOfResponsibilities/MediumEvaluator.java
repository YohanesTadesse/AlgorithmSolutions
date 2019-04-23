package ChainOfResponsibilities;

public class MediumEvaluator implements StateEvaluator {
    StateEvaluator nextState;

    @Override
    public String evaluate(final int input) {
        if (input == 2)
            return "Fan is Medium";
        return nextState.evaluate(input);
    }

    @Override
    public void setNext(final StateEvaluator nextState) {
        this.nextState = nextState;
    }
}
