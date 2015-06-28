package com.ivan.game.wuxia.model;

import java.io.Serializable;

public class Bag implements Serializable{

	int money;
	
	
	public Bag(){
		money=100;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
