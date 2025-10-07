package com.mycompany.syst17796_unoproject;

public class UnoGameTest {
    
    public static void main(String[] args) {
        System.out.println("--- SYST 17796 Deliverable 1: UNO Deck Test ---");
        
        UnoDeck unoDeck = new UnoDeck();
        
        System.out.println("Deck initialized with " + unoDeck.size() + " cards.");
        
        System.out.println("\n-- Dealing 10 Sample Cards --");
        for (int i = 0; i < 10; i++) {
            Card dealtCard = unoDeck.dealCard(); 
            if (dealtCard != null) {
                UnoCard unoCard = (UnoCard) dealtCard; 
                String cardLabel = unoCard.isActionCard() ? " (ACTION)" : " (NUMBER)";
                System.out.println("Card " + (i + 1) + ": " + unoCard.toString() + cardLabel);
            }
        }
        
        System.out.println("\nRemaining cards in deck test: " + unoDeck.size());
    }
}