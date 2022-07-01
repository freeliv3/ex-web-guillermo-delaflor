package com.nttdata.steps;

import com.nttdata.page.CalculatorPage;
import com.nttdata.stepsdefinitions.CalculatorStepsDef;
import org.openqa.selenium.WebDriver;

public class CalculatorSteps {

    private WebDriver driver;

    //constructor
    public CalculatorSteps(WebDriver driver) {this.driver = driver;}

    public void typeFirstNumber (String firstNumber) {
        this.driver.findElement(CalculatorPage.firstNumber).sendKeys(firstNumber);
    }
    public void typeSecondNumber (String secondNumber) {
        this.driver.findElement(CalculatorPage.secondNumber).sendKeys(secondNumber);
    }
    public void chooseOperation (){
        this.driver.findElement(CalculatorPage.operationListBox).click();
    }
    public void calculate(){
        this.driver.findElement(CalculatorPage.calculateButton).click();
    }

}
