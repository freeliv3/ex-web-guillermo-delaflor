package com.nttdata.steps;

import com.nttdata.page.CalculatorPage;
import com.nttdata.stepsdefinitions.CalculatorStepsDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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
    public void chooseOperation (String value){
        Select selectOperation = new Select(this.driver.findElement(CalculatorPage.operationListBox));
        selectOperation.selectByVisibleText(value);
    }
    public void calculate(){
        this.driver.findElement(CalculatorPage.calculateButton).click();
    }
    public String validarResultado(String answer){
        return this.driver.findElement(CalculatorPage.answerField).getAttribute("value");
    }

}
