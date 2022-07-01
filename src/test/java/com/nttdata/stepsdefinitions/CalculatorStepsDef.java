package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CalculatorSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.ca.Cal;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mauri\\Documents\\QA Innovation Lab\\api-guillermo-delaflor\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Before(order = 1)
    public void setScenario(Scenario scenario) {this.scenario = scenario;}

    @After
    public void quitDriver(){driver.quit();}


    @Dado("que me encuentro en la página de inicio de TestSheepNZ")
    public void que_me_encuentro_en_la_página_de_inicio_de_test_sheep_nz() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
    }
    @Cuando("ingreso dos valores FirstNumber: {string} y SecondNumber: {string}")
    public void ingreso_dos_valores_first_number_y_second_number(String primero, String segundo) {
        CalculatorSteps calculatorSteps = new CalculatorSteps(driver);
        calculatorSteps.typeFirstNumber(primero);
        calculatorSteps.typeSecondNumber(segundo);
        screenShot();

    }
    @Cuando("al dar Operation {string}")
    public void al_dar_operation(String value) {
        CalculatorSteps calculatorSteps = new CalculatorSteps(driver);
        calculatorSteps.chooseOperation(value);
        calculatorSteps.calculate();
        screenShot();
    }
    @Entonces("valido que el Answer:  {string}")
    public void valido_que_el_answer(String resultado) {
        CalculatorSteps calculatorSteps = new CalculatorSteps(driver);
        String _resultado = calculatorSteps.validarResultado(resultado);
        Assertions.assertEquals(_resultado,resultado);
    }


    public void screenShot() {
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");

    }
}
