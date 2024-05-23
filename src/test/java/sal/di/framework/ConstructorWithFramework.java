package sal.di.framework;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/OrderItem.feature",
					glue= {"sal.di.framework"},
					plugin = {"pretty"},
					publish = true
					
					
		)

public class ConstructorWithFramework {

}
