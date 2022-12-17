package Blackjack;

import java.util.ArrayList;

public class Player {
  private String name;
  private ArrayList<Card> hand;
  private int total;

  public Player(String name) {
    this.name = name;
    this.hand = new ArrayList<Card>();
    this.total = 0;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public int getTotal() {
    return this.total;
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
