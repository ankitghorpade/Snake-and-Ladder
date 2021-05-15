package com;
import java.util.Random;


  public class snake{
		 	public static void main(String[] args) {
		 		 //initialise postion by int n variable
		         int n = 0;
		         //using str array to print 
		         String[] str = {"one", "Two", "Three" ,"Four","Five","Six"};
		         Random Dice = new Random();
		       
		      //generate value of dice value
		       int display = Dice.nextInt(6);
		       
		         System.out.println(str[display]);
		         
		         //generating the random value to play options
		         int ladder_or_snake = Dice.nextInt(3);
		         int roll = Dice.nextInt(6);
		         switch (ladder_or_snake) {
		                 //Noplay case
		                 case 0:
		                         System.out.println("No play");
		                         System.out.println(n);
		                 break;
		                 //Ladder case
		                 case 1:
		                         System.out.println("Ladder");
		                         n += roll;
		                         System.out.println(n);
		                 break;
		                 //snake case
		                 case 2:
		                         System.out.println("snake");
		                         n -= roll;
		                         System.out.println(n);
		                 break;

		                 default :
		                 break;
		         }

		         

		 	}

		 }
		 
