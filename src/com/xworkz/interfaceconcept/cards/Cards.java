package com.xworkz.interfaceconcept.cards;

public interface Cards {
	public static final int price= 100;
	public static final RummyCards rummy = new RummyCards();
	public static final UNOCards uno = new UNOCards();

	
	void bidding();
	void sorting();
	void matching();
	void picking();
	
}
