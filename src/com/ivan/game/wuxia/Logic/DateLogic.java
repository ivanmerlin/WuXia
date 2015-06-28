package com.ivan.game.wuxia.Logic;

import com.ivan.game.wuxia.model.DataHelper;
import com.ivan.game.wuxia.model.Date;

public class DateLogic {

	Date date;
	DataHelper datahelper=DataHelper.getInstance();
	public void initiate(){
		date=new Date();
		datahelper.setDate(date);
	}
	public Date nextDay(){
		date=datahelper.getDate();

		int month=date.getMonth();
		int day=date.getDay();
		
		if(day==30){
			if(month==12){				
				month=1;
				RoleLogic rl=new RoleLogic();
				boolean pass=rl.ageUp();
				
				if(!pass){
					//***********************
					//播放游戏结束画面
					//***********************
				}
			}else{
				month++;
			}
			day=1;			
			date.setMonth(month);
		}else{
			day++;
		}
		
		date.setDay(day);
		datahelper.setDate(date);
		return date;
		
	}
	
	public Date passDays(int num){
		date=datahelper.getDate();

		int month=date.getMonth();
		int day=date.getDay();
		
		int deltaYear=num/365;
		int deltaDay=num%30;
		
		int deltaMonth=num%365/30;
		
		
		day=(deltaDay+day+30);
		month=(deltaMonth+month)%12;
		
		if(day==0) day=30;
		if(month==0) month=12;
		
		date.setDay(day);
		date.setMonth(month);
		
		for(int i=0;i<deltaYear;i++){
			RoleLogic rl=new RoleLogic();
			boolean pass=rl.ageUp();
			if(!pass){
				//***********************
				//播放游戏结束画面
				//***********************
			}
		}
		
		datahelper.setDate(date);
		return date;
		
	}
	
	
	
	
}
