package com.giftcards.utilities;

import org.openqa.selenium.WebElement;


public class ColorVerify {

	String linkBgColor,linkTextColor,linkBgColorChild,linkTextColorChild; 
	
	public void verifyColorOfLinkMenuOnHover(WebElement parent) {
		linkBgColor=parent.getCssValue("background-color");
		linkTextColor=parent.getCssValue("color");
		System.out.println("On hover: \n Background link color of parent is: "+linkBgColor);
		hexColorVerify(linkBgColor);
		System.out.println("\n Text color is: "+linkTextColor);
		hexColorVerify(linkTextColor);
		System.out.println("\n");
	}
	
	public void verifyColorOfLinkMenuAfterHover(WebElement parent, WebElement child) {
		linkBgColor=parent.getCssValue("background-color");
		linkTextColor=parent.getCssValue("color");
		linkBgColorChild=child.getCssValue("background-color");
		linkTextColorChild=child.getCssValue("color");
		System.out.println("After hover color of Parent menu is: \n Background link color: "+linkBgColor);
		hexColorVerify(linkBgColor);
		System.out.println("Text color is: "+linkTextColor);
		hexColorVerify(linkTextColor);
		System.out.println("\n");
		System.out.println("After hover color of Child menu is: \n Background link color: "+linkBgColorChild);
		hexColorVerify(linkBgColorChild);
		System.out.println("Text color is: "+linkTextColorChild);
		hexColorVerify(linkTextColorChild);
		System.out.println("\n");
	}
	
	private void hexColorVerify(String color) {
	try {
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1=Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2=Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3=Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("Color in Hex value is: "+actualColor);
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	}
}
