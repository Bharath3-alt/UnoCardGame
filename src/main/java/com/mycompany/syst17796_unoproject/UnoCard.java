package com.mycompany.syst17796_unoproject;

public class UnoCard extends Card {
    
    // --- UNO-Specific Constants ---
    // Define the colors required for the game
    public static final String RED = "RED";
    public static final String YELLOW = "YELLOW";
    public static final String GREEN = "GREEN";
    public static final String BLUE = "BLUE";
    public static final String WILD_COLOR = "WILD"; 
    
    // Define the card types/actions
    public static final String SKIP = "SKIP";
    public static final String REVERSE = "REVERSE";
    public static final String DRAW_TWO = "DRAW TWO";
    public static final String WILD = "WILD";
    public static final String WILD_DRAW_FOUR = "WILD DRAW FOUR";

    private final String color;
    private final String type;
    
    /**
     * Constructor for a standard UnoCard.
     * @param color The color of the card.
     * @param type The card type or number.
     */
    public UnoCard(String color, String type) {
        // Call the parent Card constructor (super) to set the suit/value fields,
        // making this UnoCard compatible with the base Card methods.
        super(color, type); 
        this.color = color;
        this.type = type;
    }
    
    // --- UNO-Specific Getters and Logic ---
    
    public String getColor() {
        return this.color;
    }

    public String getType() {
        return this.type;
    }
    
    public boolean isWild() {
        return this.color.equals(WILD_COLOR);
    }
    
    public boolean isActionCard() {
        // Checks for Skip, Reverse, Draw Two, or any Wild card
        return this.type.equals(SKIP) || this.type.equals(REVERSE) || 
               this.type.equals(DRAW_TWO) || this.isWild();
    }
    
    @Override
    public String toString() {
        if (isWild()) {
            return "[WILD CARD] " + this.type; 
        }
        return "[" + this.color + "] " + this.type;
    }
}