package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        
		features="E:\\JavaSelenium\\BDD_Project\\Features\\Day7Flight.feature",
		//features="E:\\JavaSelenium\\BDD_Project\\Features\\LoginPagevalid.feature",
		//features="E:\\JavaSelenium\\BDD_Project\\Features\\LoginPageInvalid.feature",
        glue= {"StepDefinition"},
//        dryRun=true,
        //monochrome=true,
        plugin= {"pretty", "html:target/cucumber-reports.html"}
//        plugin= {"pretty", "json:target/cucumber-reports.json"}
//        plugin= {"pretty", "xml:target/cucumber-reports.xml"}
        
        )

public class TestRunTestNG extends AbstractTestNGCucumberTests{

}


