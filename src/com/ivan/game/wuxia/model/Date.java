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
			return "十"+simpleDigitConvert(i-10);
		}else if(i<30){
			return "廿"+simpleDigitConvert(i-10);
		}else{
			return "三十";
		}
	}
	public String simpleDigitConvert(int i){
		switch(i){
		case 1:return "一";
		case 2:return "二";
		case 3:return "三";
		case 4:return "四";
		case 5:return "五";
		case 6:return "六";
		case 7:return "七";
		case 8:return "八";
		case 9:return "九";
		case 10:return "十";
		
		default:return "";
		}
	}

	public String getMonthStr(){
		if(month==1){
			return "正月";
		}else{
			return digitToWord(month)+"月";
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
		return digitToWord(day)+"日";
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}
