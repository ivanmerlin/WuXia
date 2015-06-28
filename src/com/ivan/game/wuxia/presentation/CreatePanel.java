package com.ivan.game.wuxia.presentation;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.ivan.game.wuxia.Logic.RoleLogic;
import com.ivan.game.wuxia.model.DataHelper;
import com.ivan.game.wuxia.model.Role;

public class CreatePanel extends JPanel{

	DataHelper datahelper=DataHelper.getInstance();
	ImageIcon backIcon;
	
	JTextField nameField;
	JLabel fontReminder;
	Font font=new Font("中國龍淡古體",Font.PLAIN,30);
	Font defaultFont=new Font("中國龍淡古體",Font.PLAIN,20);
	
	
	ChooseGroup genderGroup=new ChooseGroup();	
	
	ChooseItem maleItem=new ChooseItem();
	ChooseItem femaleItem=new ChooseItem();
	
	ChooseGroup preferGroup=new ChooseGroup();
	
	ChooseItem swordItem=new ChooseItem();
	ChooseItem knifeItem=new ChooseItem();
	ChooseItem stickItem=new ChooseItem();
	ChooseItem handItem=new ChooseItem();
	ChooseItem legItem=new ChooseItem();
	ChooseItem hiddenItem=new ChooseItem();
	
	JButton startButton;
	
	ImageIcon startIcon[]={
			new ImageIcon("image/create/start.png"),
			new ImageIcon("image/create/start_hover.png"),
			new ImageIcon("image/create/start_pressed.png")			
	};
	CardLayout cl ;
	Container container ;
 
	public CreatePanel(){
		super();
		this.setLayout(null);
		//this.setFont(font);
		backIcon=new ImageIcon("image/create/back.png");

		//输入姓名框
		nameField=new JTextField("");
		nameField.setBounds(444, 148, 271, 50);
		nameField.setFont(font);
		nameField.setOpaque(false);
		nameField.setBorder(new EmptyBorder(0,0,0,0));
		this.add(nameField);
		
		fontReminder=new JLabel("**請使用繁體輸入法以確保字體顯示正常。**");
		fontReminder.setBounds(420,205,300,35);
		fontReminder.setFont(defaultFont);
		this.add(fontReminder);
		
		maleItem.setBounds(280,200,195,132);
		femaleItem.setBounds(500,200,195,132);
		genderGroup.add(maleItem);
		genderGroup.add(femaleItem);
		this.add(maleItem);
		this.add(femaleItem);
		
		
		
		swordItem.setBounds(210,400,195,132);
		stickItem.setBounds(410,400,195,132);
		knifeItem.setBounds(610,400,195,132);
		handItem.setBounds(210,500,195,132);
		legItem.setBounds(410,500,195,132);
		hiddenItem.setBounds(620,500,195,132);
		
		preferGroup.add(swordItem);
		preferGroup.add(stickItem);
		preferGroup.add(knifeItem);
		preferGroup.add(handItem);
		preferGroup.add(legItem);
		preferGroup.add(hiddenItem);
		
		this.add(swordItem);
		this.add(stickItem);
		this.add(knifeItem);
		this.add(handItem);
		this.add(legItem);
		this.add(hiddenItem);		
		
		startButton=new JButton(startIcon[0]);
		startButton.setBounds(450,640,160,40);
		startButton.setContentAreaFilled(false);		
		startButton.setBorderPainted(false);	

		init();
		this.add(startButton);
		
		

	}
	public void init(){
		
		
		startButton.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
				 
				RoleLogic rl=new RoleLogic();
				rl.createRole(nameField.getText(), genderGroup.getSelectItem(), preferGroup.getSelectItem());
				 
  
				container=MainFrame.getInstance().getContentPane();
				
				cl=(CardLayout) container.getLayout();
				
				ChangAnScene changAnPanel=new ChangAnScene();
				container.add(changAnPanel,"changAn");
				
				//cl.next(container);
				cl.show(container,"changAn");
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				startButton.setIcon(startIcon[1]);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				startButton.setIcon(startIcon[0]);
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				startButton.setIcon(startIcon[2]);
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				startButton.setIcon(startIcon[0]);
			}
			
		});
	}
	
	public void paintComponent(Graphics g){				
		g.drawImage(backIcon.getImage(), 0,0,1000,800,null);
		
	}

class ChooseItem extends JLabel{
	boolean isSelected;
	ChooseGroup group;
	ImageIcon selectIcon;
	public ChooseItem(){
		selectIcon=new ImageIcon("image/create/circle.png");
		
		isSelected=false;
		this.setOpaque(false);
		this.setBorder(new EmptyBorder(0,0,0,0));
		this.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				if(isSelected){
					isSelected=false;
					group.setSelectItem(-1);
				}else{
					if(group.getSelectItem()>=0)
						group.get(group.getSelectItem()).cancelSelected();					
					int index=group.indexOf(ChooseItem.this);
					group.setSelectItem(index);
					ChooseItem.this.setIcon(selectIcon);
				}
			}


			
		});
	}
	public void setGroup(ChooseGroup cg){
		group=cg;
	}
	public void cancelSelected(){
		isSelected=false;
		this.setIcon(null);
	}
	
}
class ChooseGroup {
	private	ArrayList<ChooseItem> group=new ArrayList<ChooseItem>();
	private int selectItem;
	public ChooseGroup(){
		selectItem=-1;
		
	}
	public void add(ChooseItem c){
		group.add(c);
		c.setGroup(this);
		System.out.println("添加了一個對象");
	}
	public void remove(int i){
		group.remove(i);
	}
	public int indexOf(ChooseItem c){
		return group.indexOf(c);
	}
	public int getSelectItem(){
		return selectItem;
	}
	public void setSelectItem(int i){
		selectItem=i;
		System.out.println("select= "+i);
	}
	public ChooseItem get(int i){
		return group.get(i);
	}
}
public Container getContainer() {
	return container;
}
public void setContainer(Container container) {
	this.container = container;
	 
}	



}
