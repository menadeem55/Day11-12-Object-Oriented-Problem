package com.bridgelabz.deckofcards;

import java.util.Random;

public class DeckOfCards {
	
	/*
	 * initializing array and values
	 * fills drck of cards
	 */
	
	String [] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
	String [] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	String [][] cards = new String [4][13];
	String[][] player = new String[4][9];
	
	public void getCardCombination() {
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cards[i][j] = ranks[j] + suits[i];
			}
		}
	}
	
	public void getPlayer() {
		
		/*
		 *  in this method shuffle the cards distribute among 4 people with 9 cards each randomly
		 */
		
		int i;
		int j;
		
		for (i = 0; i < 4; i++) {
			System.out.println("\nCards for Player " + (i + 1) + "\n");
			for (j =0; j <9; j++) {
				Random random = new Random();	//create random number generator
				int randonSuit = random.nextInt(4);	//between 1 to 4
				int randomRank = random.nextInt(13);	//between 1 to 13
				player[i][j] = cards[randonSuit][randomRank];	//randomly selected cards
				System.out.println(player[i][j] + "  \n");
			}
		}
	}

}
