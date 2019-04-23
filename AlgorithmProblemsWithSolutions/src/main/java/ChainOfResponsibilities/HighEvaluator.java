package ChainOfResponsibilities;


public class HighEvaluator implements StateEvaluator {
    StateEvaluator nextEval;
    StateEvaluator preEval;
    @Override
    public String evaluate(final int input) {
        if (input == 3)
            return "Fan is High";
        return nextEval.evaluate(0);
    }

    @Override
    public void setNext(final StateEvaluator nextState) {
        this.nextEval = nextState;
    }

}
