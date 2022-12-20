package BlackjackStarterCode;

import java.util.ArrayList;
import Blackjack.Card;

public class Player {
  private String name;
  private ArrayList<Card> hand;
  private int total;

  public Player(String name) {
    // TODO Create a constructor that sets name to name, hand to a new ArrayList and total to 0.

  }

  // TODO: Create Getters
  public String getName() {
    return
  }

  public ArrayList<Card> getHand() {
    return 
  }

  public int getTotal() {
    return 
  }

  
  public void addCard(Card card) {
    this.hand.add(card);
    this.total += card.getValue();
  }

  public void clearHand() {
    this.hand.clear();
    this.total = 0;
  }
}