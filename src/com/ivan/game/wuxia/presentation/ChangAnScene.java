package com.ivan.game.wuxia.presentation;

import javax.swing.JButton;

import com.ivan.game.wuxia.presentation.button.*;

public class ChangAnScene extends ScenePanel{

	static String backPath="image/changAn/changAnMap.png";
 
	public ChangAnScene() {
		super(backPath);
		// TODO Auto-generated constructor stub
		
		//**test
		
		city="changAn";
		place="street";

		
		
		placeButton=new JButton[]{new TavernPlaceButton( ),new ResidencePlaceButton(),new GamblePlaceButton(),
				new ShopPlaceButton(),new OutsidePlaceButton() ,new LeavePlaceButton()};
		
		addPlace();
	
		
		
	}

	

	
	
	
	
	
	
}
