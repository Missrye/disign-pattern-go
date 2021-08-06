package com.deepocean.designpattern.behaviormode.memento;

/**
 * Memento interface to Originator
 *
 * This interface allows the originator to restore its state.
 */
public interface PreviousCalculationToOriginator {
    int getFirstNumber();
    int getSecondNumber();
}
