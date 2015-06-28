package com.ivan.game.wuxia.model;

import java.io.Serializable;

public class Date implements Serializable{
	
	int month;
	int day;
	
	public Date(){
		month=1;
		day=1;
		
	}
	public Date(int month,int day){
		this.month=month;
		this.day=day;
	}
	
	
	

	public String digitToWord(int i){
		if(i<=10){
			return simpleDigitConvert(i) ;
		}else if(i<20){
			return "ʮ"+simpleDigitConvert(i-10);
		}else if(i<30){
			return "إ"+simpleDigitConvert(i-10);
		}else{
			return "��ʮ";
		}
	}
	public String simpleDigitConvert(int i){
		switch(i){
		case 1:return "һ";
		case 2:return "��";
		case 3:return "��";
		case 4:return "��";
		case 5:return "��";
		case 6:return "��";
		case 7:return "��";
		case 8:return "��";
		case 9:return "��";
		case 10:return "ʮ";
		
		default:return "";
		}
	}

	public String getMonthStr(){
		if(month==1){
			return "����";
		}else{
			return digitToWord(month)+"��";
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public String getDayStr(){
		return digitToWord(day)+"��";
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
