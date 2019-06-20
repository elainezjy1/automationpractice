package mystorejbehave_example;

import com.github.valfirst.jbehave.junit.monitoring.JUnitReportingRunner;
import mystorejbehave_example.test.com.steps.HomeSteps;
import mystorejbehave_example.test.com.steps.OperationSteps;
import mystorejbehave_example.test.com.steps.TestSteps;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.*;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.*;
import org.junit.runner.RunWith;

import java.util.List;

@RunWith(JUnitReportingRunner.class)
public class JBehaveRunner_Test extends JUnitStories {

    public JBehaveRunner_Test() {
        super();
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory((new MostUsefulConfiguration())
                .useStoryReporterBuilder(
                        new StoryReporterBuilder()
                                .withDefaultFormats()
                                .withFormats(Format.CONSOLE, Format.TXT)), new OperationSteps(), new HomeSteps(), new TestSteps());
    }


    @Override
    protected List<String> storyPaths() {
        List<String> s = new StoryFinder()
                .findPaths(
                        "src/test/resources/",
                        "teststory3.story",
                        ""
                );
        return s;
    }
}
