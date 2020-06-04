/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.pickacard;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            int r=(int)((Math.random()*13)+1);
            c.setValue(r);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int e=(int)((Math.random()*3)+1);
            c.setSuit(Card.SUITS[e]);
            magicHand[i]=c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner v=new Scanner(System.in);
        System.out.println("plese enter the card number:");
        int a=v.nextInt();
        System.out.println("plese enter the card suit:");
        String b=v.next();
        String q=a+b;
        // and search magicHand here
        int x=1;
        for (int i=0; i<magicHand.length; i++){
            if(q==magicHand[i].toString()){
                x=1;         
        }
        else{
                x=0;
            }
       }
    if(x==1)
    {
        System.out.println("card found");
    }
    else{
        System.out.println("Card not found");
    }
}
}