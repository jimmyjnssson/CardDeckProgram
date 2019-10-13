package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new Deck();

        System.out.println("Deck of cards created");
        System.out.println(deck);

        deck.shuffleCards();
        System.out.println("Shuffled deck");
        System.out.println(deck);

        deck.sortedByRank();
        System.out.println("Sort by Rank");
        System.out.println(deck);

        deck.sortedBySuit();
        System.out.println("Sort by Suit");
        System.out.println(deck);

    }
}
