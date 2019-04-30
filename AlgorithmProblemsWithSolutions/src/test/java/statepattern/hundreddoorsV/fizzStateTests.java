package statepattern.hundreddoorsV;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class fizzStateTests {

    @Test
    public void shouldString() {
        // arrange
        SomeClass someClass = new SomeClass(1);
        String result = someClass.evaluate(1);


        // assert
        assertThat(result, is("1"));
    }

    @Test
    public void shouldFizzBuzz() {
        // arrange
        SomeClass someClass = new SomeClass(1);
        String result = someClass.evaluate(15);

        // assert
        assertThat(result, is("fizzbuzz"));
    }

    @Test
    public void shouldFizz() {
        // arrange
        SomeClass someClass = new SomeClass(1);
        String result = someClass.evaluate(3);


        // assert
        assertThat(result, is("fizz"));
    }

    @Test
    public void shouldBuzz() {
        // arrange
        SomeClass someClass = new SomeClass(1);
        String result = someClass.evaluate(5);


        // assert
        assertThat(result, is("buzz"));
    }

    @Test
    public void shouldEvaluateIntCorrectly(){
        // arrange
        SomeClass someClass = new SomeClass(1);

        // assert

    }


    private class SomeClass {


        public SomeClass(final int input) {

        }

        public String evaluate(final int input) {
            if (input % 15 == 0) return "fizzbuzz";

            if (input % 5 == 0) return "buzz";

            if (input % 3 == 0) return "fizz";

            return String.valueOf(input);
        }
    }


}
