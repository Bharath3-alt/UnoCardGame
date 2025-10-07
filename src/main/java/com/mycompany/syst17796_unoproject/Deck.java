package com.mycompany.syst17796_unoproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // NOTE: This list must be protected for UnoDeck to access it directly
    protected List<Card> cards; 

    public Deck() {
        // Initialize the list of cards
        this.cards = new ArrayList<>();
    }
    
    // Essential methods for any deck
    public void shuffle() {
        Collections.shuffle(this.cards);
    }
    
    public Card dealCard() {
        if (cards.isEmpty()) {
            return null; // Deck is empty
        }
        return cards.remove(0); // Deals the top card
    }
    
    public int size() {
        return cards.size();
    }
}