package Blackjack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Blackjack {
  private static ArrayList<Card> deck;
  private static Player player;
  private static Player dealer;

  public static void main(String[] args) {
    deck = new ArrayList<Card>();
    createDeck();

    // Create two players, player and dealer
    player = new Player("Player");
    dealer = new Player("Dealer");

    Scanner scanner = new Scanner(System.in);
    String input;

    // deal initial cards
    player.addCard(deck.remove(0));
    dealer.addCard(deck.remove(0));
    player.addCard(deck.remove(0));
    dealer.addCard(deck.remove(0));

    // show initial hands
    System.out.println("Dealer's hand: " + dealer.getHand().get(0).getRank() + " of " + dealer.getHand().get(0).getSuit() + " and [hidden]");
    System.out.println("Your hand: " + player.getHand().get(0).getRank() + " of " + player.getHand().get(0).getSuit() + " and " + player.getHand().get(1).getRank() + " of " + player.getHand().get(1).getSuit());
    System.out.println("Your total: " + player.getTotal());

    // player's turn
    while (true) {
      System.out.print("Would you like to hit or stand? (h/s) ");
      input = scanner.nextLine();

      if (input.equals("h")) {
        player.addCard(deck.remove(0));
        System.out.println("You were dealt a " + player.getHand().get(player.getHand().size() - 1).getRank() + " of " + player.getHand().get(player.getHand().size() - 1).getSuit());
        System.out.println("Your total: " + player.getTotal());

        if (player.getTotal() > 21) {
          System.out.println("You bust! Dealer wins.");
          break;
        }
      } else if (input.equals("s")) {
        break;
      }
    }

    // dealer's turn
    while (dealer.getTotal() < 17 && player.getTotal() <= 21) {
      dealer.addCard(deck.remove(0));
      System.out.println("Dealer was dealt a " + dealer.getHand().get(dealer.getHand().size() - 1).getRank() + " of " + dealer.getHand().get(dealer.getHand().size() - 1).getSuit());
      System.out.println("Dealer total: " + dealer.getTotal());

      if (dealer.getTotal() > 21) {
        System.out.println("Dealer busts! You win.");
        break;
      }
    }


    if (dealer.getTotal() <= 21 && player.getTotal() <= 21) {
      if (dealer.getTotal() > player.getTotal()) {
        System.out.println("Dealer wins.");
      } else if (dealer.getTotal() < player.getTotal()) {
        System.out.println("You win!");
      } else {
        System.out.println("It's a tie.");
      }
    }

    scanner.close();
  }

  // Creates deck and shuffles it.
  private static void createDeck() {
    String[] suits = {"hearts", "diamonds", "spades", "clubs"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

    for (int i = 0; i < suits.length; i++) {
      for (int j = 0; j < ranks.length; j++) {
        deck.add(new Card(suits[i], ranks[j], values[j]));
      }
    }

    Collections.shuffle(deck);
  }
}

