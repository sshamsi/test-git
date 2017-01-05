package com.practice.cards;

import org.junit.Test;

public class TestCard {
	
	@Test
	public void initialize(){
		Deck deck = new Deck();
		deck.shuffle();
		Card card[] = deck.getAllCards();
		for(int i=0; i<card.length ; i++){
			System.out.println(card[i].suit+" "+card[i].face);
		}
	}
	
	@Test
	public void generateRandomNumber(){
		System.out.println(Math.random());
	}
	
	@Test
	public void dealOneCard(){
		Deck deck = new Deck();
		deck.shuffle();
		for(int i=0 ; i<100 ;i++){
			Card card = deck.dealOneCard();
			System.out.println(card.suit+" "+card.face);
		}
	}

}
