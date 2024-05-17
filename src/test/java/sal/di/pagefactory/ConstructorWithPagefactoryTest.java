package sal.di.pagefactory;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/OrderItem.feature",
					glue= {"sal.di.pagefactory"},
					plugin = {"pretty"},
					publish = true
					
					
		)

public class ConstructorWithPagefactoryTest {

}
