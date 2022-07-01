package com.nttdata.page;

import org.openqa.selenium.By;

public class CalculatorPage {

    public static By firstNumber = By.id("number1Field");
    public static By secondNumber = By.id("number2Field");
    public static By operationListBox = By.id("selectOperationDropdown");
    public static By calculateButton = By.id("calculateButton");
    public static By answerField = By.id("numberAnswerField");
}
