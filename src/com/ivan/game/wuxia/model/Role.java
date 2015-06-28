package com.ivan.game.wuxia.model;

import java.io.Serializable;
import java.util.ArrayList;


public class Role implements Serializable{
private
	/*
	 * 基本能力
	 */
	int hp;
	int maxHp;
	int speed;
	int knifeSkill;
	int knifeExp;
	int swordSkill;
	int swordExp;
	int stickSkill;
	int stickExp;
	int handSkill;
	int handExp;
	int legSkill;
	int legExp;
	int hiddenSkill;
	int hiddenExp;
	int gender;//男--0 女--1
	String name;
	int age; 
	ArrayList skills=new ArrayList();
	
	
	

	public Role(String name,int gender,int prefer){
		this.name=name;
		maxHp=100;
		hp=maxHp;
		speed=10;
		knifeSkill=0;
		knifeExp=0;
		swordSkill=0;
		swordExp=0;
		stickSkill=0;
		stickExp=0;
		handSkill=0;
		handExp=0;
		legSkill=0;
		legExp=0;
		hiddenSkill=0;
		hiddenExp=0;
		age=19;
		this.gender=gender;
		setPrefer(prefer);
		
		
	}
	
	// sword=0,stick=1,knife=2,hand=3,leg=4,hidden=5
	public void setPrefer(int i){
		switch(i){
		case 0: swordSkill=1;
				swordExp=100;
				break;
		case 1:
			stickSkill=1;
			stickExp=100;
			break;
		case 2:
			knifeSkill=1;
			knifeExp=100;
			break;
		case 3:
			handSkill=1;
			handExp=100;
			break;
		case 4:
			legSkill=1;
			legExp=100;
			break;
		case 5:
			hiddenSkill=1;
			hiddenExp=100;
			break;
		default:break;
		}
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getKnifeSkill() {
		return knifeSkill;
	}


	public void setKnifeSkill(int knifeSkill) {
		this.knifeSkill = knifeSkill;
	}


	public int getKnifeExp() {
		return knifeExp;
	}


	public void setKnifeExp(int knifeExp) {
		this.knifeExp = knifeExp;
	}


	public int getSwordSkill() {
		return swordSkill;
	}


	public void setSwordSkill(int swordSkill) {
		this.swordSkill = swordSkill;
	}


	public int getSwordExp() {
		return swordExp;
	}


	public void setSwordExp(int swordExp) {
		this.swordExp = swordExp;
	}


	public int getStickSkill() {
		return stickSkill;
	}


	public void setStickSkill(int stickSkill) {
		this.stickSkill = stickSkill;
	}


	public int getStickExp() {
		return stickExp;
	}


	public void setStickExp(int stickExp) {
		this.stickExp = stickExp;
	}


	public int getHandSkill() {
		return handSkill;
	}


	public void setHandSkill(int handSkill) {
		this.handSkill = handSkill;
	}


	public int getHandExp() {
		return handExp;
	}


	public void setHandExp(int handExp) {
		this.handExp = handExp;
	}


	public int getLegSkill() {
		return legSkill;
	}


	public void setLegSkill(int legSkill) {
		this.legSkill = legSkill;
	}


	public int getLegExp() {
		return legExp;
	}


	public void setLegExp(int legExp) {
		this.legExp = legExp;
	}


	public int getHiddenSkill() {
		return hiddenSkill;
	}


	public void setHiddenSkill(int hiddenSkill) {
		this.hiddenSkill = hiddenSkill;
	}


	public int getHiddenExp() {
		return hiddenExp;
	}


	public void setHiddenExp(int hiddenExp) {
		this.hiddenExp = hiddenExp;
	}


	public ArrayList getSkills() {
		return skills;
	}


	public void setSkills(ArrayList skills) {
		this.skills = skills;
	}


	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
