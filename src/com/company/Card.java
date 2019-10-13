package com.company;

public class Card {

private Rank rank;
private Suit suit;

enum Rank {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
    NINE, TEN, JACK, QUEEN, KING};

enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES};


public Card (Rank rank, Suit suit){

    this.rank = rank;
    this.suit = suit;

}


    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " " + "of" + " " + suit;
    }
}
