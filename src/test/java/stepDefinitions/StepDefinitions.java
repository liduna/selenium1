package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {


    private WebDriver driver;


    @Given ("I have entered address https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php")

    public void i_navigate_to_webpage (){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");

    }

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(int first) {

        WebElement addFirst = driver.findElement(By.name("n01"));
        addFirst.sendKeys("123");




    }

    @Given("I have also entered {int} into the calculator")
    public void i_have_also_entered_into_the_calculator(int second) {

        WebElement addSecond = driver.findElement(By.name("n02"));
        addSecond.sendKeys("456");

    }

    @When("I press add")
    public void i_press_add() {

        WebElement additionButton = driver.findElement(By.xpath("//input[@value='Find Addition']"));
        additionButton.click();

    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(int result) {
        WebElement addResult= driver.findElement(By.xpath("//input[@name='answer']"));

        assertEquals(true,  addResult.isDisplayed());

    }


    @Given("I have entered https:\\/\\/www.marshu.com\\/articles\\/calculate-addition-calculator-add-two-numbers.php")
    public void iHaveEnteredHttpsWwwMarshuComArticlesCalculateAdditionCalculatorAddTwoNumbersPhp() {
    }
}