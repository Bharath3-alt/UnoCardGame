package com.mycompany.syst17796_unoproject;

// import Deck is NOT needed here

public class UnoDeck extends Deck {
    
    // Constants copied from UnoCard for card creation logic
    private static final String[] COLORS = {
        UnoCard.RED, UnoCard.YELLOW, UnoCard.GREEN, UnoCard.BLUE
    };
    
    // Colored cards: 1-9 (x2), Skip (x2), Reverse (x2), Draw Two (x2)
    private static final String[] COLOR_TYPES = {
        "1", "2", "3", "4", "5", "6", "7", "8", "9", 
        UnoCard.SKIP, UnoCard.REVERSE, UnoCard.DRAW_TWO
    };

    /**
     * Constructor initializes a standard 108-card UNO deck.
     */
    public UnoDeck() {
        super(); // Call base Deck constructor to initialize the 'cards' list
        
        // 1. Add all 4 color '0' cards (1 of each color)
        for (String color : COLORS) {
            this.cards.add(new UnoCard(color, "0")); 
        }
        
        // 2. Add two of every other colored card (72 cards total)
        for (String color : COLORS) {
            for (String type : COLOR_TYPES) {
                this.cards.add(new UnoCard(color, type)); // First card
                this.cards.add(new UnoCard(color, type)); // Second card
            }
        }
        
        // 3. Add 8 Wild Cards (4 regular Wild, 4 Wild Draw Four)
        for (int i = 0; i < 4; i++) {
            this.cards.add(new UnoCard(UnoCard.WILD_COLOR, UnoCard.WILD));
            this.cards.add(new UnoCard(UnoCard.WILD_COLOR, UnoCard.WILD_DRAW_FOUR));
        }
        
        shuffle(); // Shuffle the deck after creation (method inherited from Deck)
    }
}