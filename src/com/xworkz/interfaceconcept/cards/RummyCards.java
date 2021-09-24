package com.xworkz.interfaceconcept.cards;

public class RummyCards implements Cards {
	int noOfCards = 53;
	int noOfPlayers= 2;


	@Override
	public void bidding() {
		System.out.println("*we can bid the money to the oponent");

	}

	@Override
	public void sorting() {
		System.out.println("*we have to sort the cards in order");

	}

	@Override
	public void matching() {
		System.out.println("*we have to match symbols accordingly");

	}

	@Override
	public void picking() {
		System.out.println("*we have to pick the card when the turn comes");

	}

	@Override
	public String toString() {
		return "RummyCards [noOfCards=" + noOfCards + ", noOfPlayers=" + noOfPlayers + "]";
	}

	
	
	

}
