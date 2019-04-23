package ChainOfResponsibilities;


public class DefaultEvaluator implements StateEvaluator {

    StateEvaluator nextState;
    @Override
    public String evaluate(int input) {
        if (input == 0)
            return "Fan is Off";

        return nextState.evaluate(input);
    }

    @Override
    public void setNext(final StateEvaluator nextState) {
        this.nextState = nextState;
    }
}
