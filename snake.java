package com;
import java.util.Random;


  public class snake{
		 	public static void main(String[] args) {
		 		 //variable
		         int n = 0;
		         Random Dice = new Random();
		       
		       String[] str = {"one", "Two", "Three" ,"Four","Five","Six"};
		       int roll = Dice.nextInt(6);
		       
		         System.out.println(str[roll]);

		 	}

		 }
		 
