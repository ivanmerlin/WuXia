package com.ivan.game.wuxia.Logic;

import com.ivan.game.wuxia.model.Bag;
import com.ivan.game.wuxia.model.DataHelper;
import com.ivan.game.wuxia.model.Role;

public class RoleLogic {

	DataHelper datahelper=DataHelper.getInstance();
	Role role;
	public void createRole(String name,int gender,int prefer){
		 role=new Role(name,gender,prefer);
		datahelper.setRole(role);
		BagLogic bl=new BagLogic();
		bl.createBag();
		DateLogic dl=new DateLogic();
		dl.initiate();
	}

	public boolean ageUp(){
		role=datahelper.getRole();
		role.setAge(role.getAge()+1);
		datahelper.setRole(role);
		if(role.getAge()<50){
			return true;
		}else{
			return false;
		}
	}

 
}
