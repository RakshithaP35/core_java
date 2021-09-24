package com.xworkz.classobject.clothes;

public class ClothesTester {

	public static void main(String[] args) {
		Clothes sweaterClothes = new Clothes();
		sweaterClothes.brand = "MAX";
		sweaterClothes.color = "Black";
		sweaterClothes.material = "Cotton";
		sweaterClothes.prize = 750;
		sweaterClothes.size = 'M';
	
		System.out.println("Brand of the Sweater is : " + sweaterClothes.brand);
		System.out.println("Color of the Sweater is : " + sweaterClothes.color);
		System.out.println("Material of the Sweater is : " + sweaterClothes.material);
		System.out.println("Prize of the Sweater is : " + sweaterClothes.prize);
		System.out.println("Size of the Sweater is : " + sweaterClothes.size);
		
		sweaterClothes.toKeepWarm();
		sweaterClothes.safeGaurd();
	
		Clothes hat = new Clothes();
		hat.brand = "Nike";
		hat.color = "Grey";
		hat.prize = 140;
		
		System.out.println("Brand of the Hat is : " + hat.brand);
		System.out.println("Color of the Hat is : " + hat.color);
		System.out.println("Prize of the Hat is : " + hat.prize);
		
		hat.protectFromSun();
	}

}
