package mystorejbehave_example.test.com.steps;

import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

public class OperationSteps extends Steps {

    long value1;
    long value2;
    long result;

    @Given("value1 <value1> and value2 <value2>")
    public void setvalue(@Named("value1") Long value1, @Named("value2") long value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @When("do calculation <operation>")
    public void operate(@Named("operation") String operation) {
        switch (operation) {
            case "+":
                result = addition(this.value1, this.value2);
                break;
            case "-":
                result = minus(this.value1, this.value2);
                break;
            case "*":
                result = multiplication(this.value1, this.value2);
                break;
            case "/":
                result = division(this.value1, this.value2);
                break;
        }
    }

    @Then("verify value is <expectedValue>")
    public void verify(@Named("expectedValue") String expectedValue) {

        Assert.assertEquals(expectedValue, Long.toString(this.result));
        System.out.println("result value is:"+this.result);
    }

    public long addition (long a, long b) {
        return a+b;
    }

    public long minus (long a, long b) {
        return a-b;
    }

    public long multiplication (long a, long b) {
        return a*b;
    }

    public long division(long a, long b) {
        return a/b;
    }


}
