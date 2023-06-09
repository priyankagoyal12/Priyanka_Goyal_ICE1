/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package card;
 import java.util.Random;
 import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author priyanka
 * //Priyanka Priyanka (991676014) 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random pick= new Random();
            c.setValue(pick.nextInt(13)+1);//Generates a random value between 1 and 13 (inclusive)
            c.setSuit(Card.SUITS[pick.nextInt(3)]);//Generates a random index between 0 and 3
            magicHand[i] =c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value of your card:");
        int choice=keyboard.nextInt();
        System.out.println("Enter the valid suit of your card(0-3)from Hearts,Diamonds,Spades,Clubs: ");
        int suit=keyboard.nextInt();
        
        Card customerCard= new Card();
        customerCard.setValue(choice);
        customerCard.setSuit(Card.SUITS[suit]);
        
         Card luckyCard = new Card();
         luckyCard.setValue(7);  // Set the card value (e.g., 7)
         luckyCard.setSuit(Card.SUITS[1]);  // Set the card suit
     
         boolean foundMatch = false;
        for (Card card : magicHand) {
            if (card.equals(customerCard)) {
                foundMatch = true;
                break;
            }
        }

        if (foundMatch) {
            System.out.println("Congratulations! Your card was found in the magic hand.");
        } else {
            System.out.println("Sorry, your card was not found in the magic hand.");
        
        }
    }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
