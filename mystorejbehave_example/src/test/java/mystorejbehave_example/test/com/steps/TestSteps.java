package mystorejbehave_example.test.com.steps;

import org.jbehave.core.annotations.*;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

public class TestSteps extends Steps {


    @BeforeStory // equivalent to @BeforeStory(uponGivenStory=false)
    public void beforeStory() {
        //System.out.println("This is before story");
    }

    @BeforeStories
    public void beforeStories() {
        //System.out.println("This is before stories");
    }

    @BeforeScenario(uponType=ScenarioType.EXAMPLE)
    public void beforeEachScenario() {
        System.out.println("This is before each scenario");
    }

}
