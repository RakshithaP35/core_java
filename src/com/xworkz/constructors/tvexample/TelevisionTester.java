package com.xworkz.constructors.tvexample;

public class TelevisionTester {

	public static void main(String[] args) {
		Television samsung = new Television("samsung", "Bravia");

		samsung.display();
		samsung.watchingTv("HBO");
		samsung.playingGames();
		samsung.consumingPower(500);

		Television lg = new Television("LG", "Basic", 32, 1080, 20000.00, false);

		lg.display();
		lg.watchingTv("Star Movies");
		lg.playingGames();
		lg.consumingPower(350);
	}

}
