package com.ivan.game.wuxia.presentation.button;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.ivan.game.wuxia.model.DataHelper;
import com.ivan.game.wuxia.presentation.MainFrame;

public class LoadDataButton extends PlaceButton{

	
	DataHelper datahelper=DataHelper.getInstance();
	
	public LoadDataButton(){
		super();
		backIcon=new ImageIcon("image/place/loadData.png");
		this.setIcon(backIcon);
		
		this.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				datahelper.open();
				
				
				Container container=MainFrame.getInstance().getContentPane();
				CardLayout cl=(CardLayout) container.getLayout();
				
				String place;
				if (datahelper.getPlace().equals("street")) {
					System.out.println("get here");
					place = datahelper.getCity();
				} else {
					place = datahelper.getPlace();
				}
				cl.show(container,place);
				
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
