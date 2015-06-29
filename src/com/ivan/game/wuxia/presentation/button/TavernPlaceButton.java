package com.ivan.game.wuxia.presentation.button;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.ivan.game.wuxia.presentation.MainFrame;
import com.ivan.game.wuxia.presentation.place.TavernPanel;

public class TavernPlaceButton extends PlaceButton{

	
	Container container;
	
	public TavernPlaceButton(){
		super();
	 
		backIcon=new ImageIcon("image/place/tavern.png");
		this.setIcon(backIcon);
		
		this.addMouseListener(new MouseAdapter(){
			   //������¼�
			   public void mouseClicked(MouseEvent e){	
				   container=MainFrame.getInstance().getContentPane();
				   CardLayout cl=(CardLayout) container.getLayout();
				   
				   TavernPanel tp=new TavernPanel();
				   container.add(tp,"tavern");
				   
				   cl.show(container, "tavern");

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
