package com.mycompany.syst17796_unoproject;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    // List of cards in the player's hand. Protected for UnoPlayer to access.
    protected List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }
    
    public int getCardCount() {
        return this.cards.size();
    }
    
    // Basic method to remove a card from the hand
    public Card playCard(int index) {
        if (index >= 0 && index < cards.size()) {
            return cards.remove(index);
        }
        return null; // Invalid index
    }
}