package com.xworkz.interfaceconcept.cards;

public class CardsTester {

	public static void main(String[] args) {
		Cards c = new RummyCards();
		c.bidding();
		c.matching();
		c.picking();
		c.sorting();
		System.out.println(c.rummy);
		
		
		UNOCards c1 = new UNOCards();
		c1.bidding();
		c1.makingEmpty();
		c1.picking();
		System.out.println(c1.uno);
		
	}

}
