package ChainOfResponsibilities;

public class Factory {

    public static StateEvaluator create() {
        final StateEvaluator defaultEval = new DefaultEvaluator();
        final StateEvaluator lowEval = new LowEvaluator();
        final StateEvaluator mediumEval = new MediumEvaluator();
        final StateEvaluator highEval = new HighEvaluator();

        defaultEval.setNext(lowEval);
        lowEval.setNext(mediumEval);
        mediumEval.setNext(highEval);
        highEval.setNext(defaultEval);

        return defaultEval;
    }




}
