package com.company;

import java.util.*;

public class Deck {


    List<Card> deckOfCards = new ArrayList<>();
    CompareRank rankCompare= new CompareRank();
    CompareSuit suitCompare= new CompareSuit();



    public Deck() {


        for (Card.Suit suit : Card.Suit.values()) {       //For-each to add the a Card object with enum-values Rank and Suit and place it in a list
            for (Card.Rank rank : Card.Rank.values()) {   //Method values() creates one instance of every card from Enum Rank/Suit. Therefore 52 cards
                                                          //will be created.
                deckOfCards.add(new Card(rank, suit));



            }
        }
    }

    public void shuffleCards(){
        Collections.shuffle(deckOfCards);

    }

    public void sortedByRank() {
        Collections.sort(deckOfCards, rankCompare);
    }

    public void sortedBySuit() {
        Collections.sort(deckOfCards, suitCompare);
    }

    public void drawFromDeck(){

    }




    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Card card : deckOfCards) {
            builder.append(card + "\n");
        }
        return builder.toString();
    }

    public class CompareRank implements Comparator<Card> {
        @Override
        public int compare(Card card1, Card card2) {
            if (card1.getRank() == card2.getRank()) {
                return card1.getSuit().compareTo(card2.getSuit());
            }
            return card1.getRank().compareTo(card2.getRank());
        }
    }

    public class CompareSuit implements Comparator<Card> {
        @Override
        public int compare(Card card1, Card card2) {
            if (card1.getSuit() == card2.getSuit()) {
                return card1.getRank().compareTo(card2.getRank());
            }
            return card1.getSuit().compareTo(card2.getSuit());
        }






}

}
