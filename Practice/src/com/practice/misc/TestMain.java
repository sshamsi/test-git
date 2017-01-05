package com.practice.misc;

public class TestMain {
	
	public static void main(String args[]){
		CreditCard creditCard = new CreditCard();
		creditCard.setCardId(7);
		System.out.println(creditCard.getCardId());
	}
}

class CreditCard{
	private int cardId=9;

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
}
