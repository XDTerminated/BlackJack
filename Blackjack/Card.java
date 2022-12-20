package Blackjack;


// Card class
public class Card {
    private String suit;
    private String rank;
    private int value;


    // Constructor
    public Card(String suit, String rank, int value) {
      this.suit = suit;
      this.rank = rank;
      this.value = value;
    }
    
    // Getters
    public String getSuit() {
      return this.suit;
    }
  
    public String getRank() {
      return this.rank;
    }
  
    public int getValue() {
      return this.value;
    }
  }
  