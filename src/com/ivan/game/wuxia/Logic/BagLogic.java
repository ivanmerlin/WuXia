package com.ivan.game.wuxia.Logic;

import com.ivan.game.wuxia.model.Bag;
import com.ivan.game.wuxia.model.DataHelper;

public class BagLogic {

	DataHelper datahelper=DataHelper.getInstance();
	Bag bag;
	public void createBag(){
		bag=new Bag();
		datahelper.setBag(bag);
	}
	
	
	
}
