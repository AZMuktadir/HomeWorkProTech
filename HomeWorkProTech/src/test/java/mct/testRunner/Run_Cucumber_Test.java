package mct.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features= {"src/test/resources/"},
					glue= {"mct_accountActivitesValidate"},
					plugin={"pretty", "html:out"}, 
					tags = {"@Act"},
					snippets=SnippetType.CAMELCASE
					
		)
public class Run_Cucumber_Test {

}
