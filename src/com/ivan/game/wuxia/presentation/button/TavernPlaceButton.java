package com.ivan.game.wuxia.presentation.button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TavernPlaceButton extends PlaceButton{

	
	
	
	public TavernPlaceButton(){
		super();
		backIcon=new ImageIcon("image/place/tavern.png");
		this.setIcon(backIcon);
		
		this.addMouseListener(new MouseAdapter(){
			   //������¼�
			   public void mouseClicked(MouseEvent e){	


			   }	
			 //������¼�
			   public void mousePressed(MouseEvent e){


			   }	
			    //����ͷ��¼�
			    public void mouseReleased(MouseEvent e){


			    }
			    //�������¼�
			    public void mouseEntered(MouseEvent e){


			    }
			    //����뿪�¼�
			    public void mouseExited(MouseEvent e){


			    }
			
			
			
			
			
			
			
			
		});
	 
	}
	
	
 
}
