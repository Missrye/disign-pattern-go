package com.deepocean.designpattern.behaviormode.memento;

/**
 * Originator Implementation
 */
public class CalculatorImpl implements Calculator {

    private int firstNumber;

    private int secondNumber;


    @Override
    public PreviousCalculationToCareTaker backupLastCalculation() {
        // Create a memento object used for restoring two numbers
        return new PreviousCalculationImpl(firstNumber, secondNumber);
    }

    @Override
    public void restorePreviousCalculation(PreviousCalculationToCareTaker memento) {
        this.firstNumber = ((PreviousCalculationToOriginator) memento).getFirstNumber();
        this.secondNumber = ((PreviousCalculationToOriginator) memento).getSecondNumber();
    }

    @Override
    public int getCalculationResult() {
        // result is adding two numbers
        return firstNumber + secondNumber;
    }

    @Override
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    @Override
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
