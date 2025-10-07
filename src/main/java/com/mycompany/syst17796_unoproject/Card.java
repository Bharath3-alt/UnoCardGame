package com.mycompany.syst17796_unoproject;

public class Card {
    // Base attributes: UNO will repurpose these as color (suit) and type (value)
    private final String suit; 
    private final String value; 

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }

    // A simple toString method for display
    @Override
    public String toString() {
        return suit + " " + value;
    }
}