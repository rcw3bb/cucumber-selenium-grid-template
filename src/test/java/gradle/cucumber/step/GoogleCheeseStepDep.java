package gradle.cucumber.step;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.domain.GoogleCheese;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleCheeseStepDep {

    private GoogleCheese googleCheese;

    @Given("I am on the Google search page")
    public void I_visit_google() throws MalformedURLException {
        String hubUrl = "http://localhost:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.firefox();

        capability.setBrowserName("firefox");
        capability.setPlatform(Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), capability);

        googleCheese = new GoogleCheese(driver);
    }

    @When("I search for {string}")
    public void search_for(String query) {
        googleCheese.submitQuery(query);
    }

    @Then("the page title should start with {string}")
    public void checkTitle(String titleStartsWith) {
        googleCheese.checkTitle(titleStartsWith);
    }

    @After()
    public void closeBrowser() {
        googleCheese.closeBrowser();
    }
}
