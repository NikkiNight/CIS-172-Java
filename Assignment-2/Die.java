//package com.mycompany.diceproject;

public class Die {

    // Declarations
    private final int HIGHEST_DIE_VALUE = 6;
    private final int LOWEST_DIE_VALUE = 1;
    private int randomValue;

    // Constructor
    public Die() {
        randomValue = (int)(Math.random() * (HIGHEST_DIE_VALUE - LOWEST_DIE_VALUE + 1)) + LOWEST_DIE_VALUE;
	}

    // Method to display
    public void ShowNumber() {
        System.out.println("Number: " + randomValue);
    }
}