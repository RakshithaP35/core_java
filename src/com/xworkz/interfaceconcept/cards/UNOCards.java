package com.xworkz.interfaceconcept.cards;

public class UNOCards extends RummyCards{
	int reverseCard = 4;

	@Override
	public void bidding() {
		System.out.println("\n*we can bid the money to the oponent");

	}

	@Override
	public void picking() {
		System.out.println("*we have to pick the card when the turn comes");

	}

	public void makingEmpty() {
		System.out.println("*in UNO we have to empty the cards");
	}

	@Override
	public String toString() {
		return "UNOCards [reverseCard=" + reverseCard + "]";
	}
	

}
