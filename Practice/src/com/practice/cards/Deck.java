package com.practice.cards;

public class Deck {
	
	int cardsLeft=51;
	Card card[] = new Card[52];
	String[] suits={"heart","spade","club","diamond"};
	String[] face = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	private int cardsUsed;
	
	public Deck(){
		
		    int i=0;
			for(int j=0; j<suits.length ; j++){
				for(int k=0; k < face.length ;k++){
					card[i] = new Card(suits[j], face[k]);
					i++;
				}
			}
			cardsUsed = 0;
	}
	
	public void shuffle(){
       for ( int i = card.length-1; i > 0; i-- ) {
            int random = (int)(Math.random()*(i+1));
            Card temp = card[i];
            card[i] = card[random];
            card[random] = temp;
        }
	}
	
	public Card dealOneCard(){
		if (cardsUsed == card.length)
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        System.out.println("CardsUsed.."+cardsUsed);
        String abc = null;
        abc.length();
        return card[cardsUsed - 1];
	}
	
	public Card[] getAllCards(){
		return card;
	}
	
	

}
