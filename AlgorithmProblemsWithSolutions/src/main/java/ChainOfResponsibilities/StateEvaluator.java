package ChainOfResponsibilities;

public interface StateEvaluator {
    String evaluate(int input);
    void setNext(StateEvaluator nextState);
}
