package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.Caret;

public class Deck {

	List<Card> cards = new ArrayList<Card>();
	//this list is my deck
	
	Deck() {
		String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
		String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
	
		
		//class of deck and need to shuffle need 52 instances of Card (Capitol C is referring to data types)
		//do Card first
		//deck second shuffle then deal into the players hand
		//player then flip card and your method you create will do that then comparing each card are flipping
		//then app in the end we will evaluate the total  in the end who wins.
		
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count); 
				this.cards.add(card);
				count++;
				
			}
		}
		//do getters and setters for rank change out Caret and count to rank
		

	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	public void describe() {
		for(Card card : this.cards) {
	}
		
}
	public void shuffle() {
		Collections.shuffle(this.cards);
		
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return null;
		
	}
	
}

