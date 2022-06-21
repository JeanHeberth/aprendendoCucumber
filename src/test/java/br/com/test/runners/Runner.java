package br.com.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "classpath:features",
        features = "src/main/resources/features/aprender_cucumber.feature",
        glue = "br.com.test.steps",
        tags = "~@ignore",
        plugin = "pretty",
        monochrome = true,
        snippets = SnippetType.CAMELCASE
)
public class Runner {

}

