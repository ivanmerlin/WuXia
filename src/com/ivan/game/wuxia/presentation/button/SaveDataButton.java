package com.ivan.game.wuxia.presentation.button;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.ivan.game.wuxia.model.DataHelper;

public class SaveDataButton extends PlaceButton{

	
 DataHelper datahelper=DataHelper.getInstance();
	
	public SaveDataButton(){
		super();
		backIcon=new ImageIcon("image/place/saveData.png");
		this.setIcon(backIcon);
		
		this.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				datahelper.save();
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	
 
}
