package com.ivan.game.wuxia.presentation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ivan.game.wuxia.model.Bag;
import com.ivan.game.wuxia.model.DataHelper;
import com.ivan.game.wuxia.model.Date;
import com.ivan.game.wuxia.model.Role;
import com.ivan.game.wuxia.presentation.button.LoadDataButton;
import com.ivan.game.wuxia.presentation.button.ResidencePlaceButton;
import com.ivan.game.wuxia.presentation.button.SaveDataButton;
import com.ivan.game.wuxia.presentation.button.TavernPlaceButton;

public class ScenePanel  extends JPanel{
	ImageIcon backIcon;
	ImageIcon headIcon;
	DataHelper datahelper=DataHelper.getInstance();
	Role role;
	Bag bag;
	Date date;
	JLabel hpLabel ;
	JLabel moneyLabel;
	JLabel ageLabel;
	JLabel dateLabel;
	JLabel nameLabel;
	SaveDataButton saveDataButton=new SaveDataButton();
	LoadDataButton loadDataButton=new LoadDataButton();
	Font font=new Font("华文行楷",Font.BOLD,28);
	JButton[] placeButton;
	public ScenePanel(String backPath){
		super();
		role=datahelper.getRole();
		bag=datahelper.getBag();
		date=datahelper.getDate();
		backIcon=new ImageIcon(backPath);
		String headPath;
		//*****************************
		//正式使用的代码
		//******************************
//		if(role.getGender()==1){
//			headPath="image/femaleRole.png";
//		}else{
//			headPath="image/maleRole.png";
//		}
		//***********************
		//********************************
		//测试使用的代码
		headPath="image/femaleRole.png";
		 
		role=new Role("阿宁",1,1);
		bag=new Bag();
		date=new Date();
		//*********************		
				
		headIcon=new ImageIcon(headPath);
		
		this.setLayout(null);
		
		
//体力
		hpLabel=new JLabel(role.getHp()+" / "+role.getMaxHp());
		hpLabel.setFont(font);
		hpLabel.setForeground(Color.BLACK);
	    hpLabel.setLocation(236,55);
		hpLabel.setSize(150,30);
		this.add(hpLabel);
		
//		JButton button=new JButton("hello");
//		button.setLocation(500,400);
//		button.setSize(100,50);
//		this.add(button);

//金钱
		moneyLabel=new JLabel(bag.getMoney()+"");
		moneyLabel.setFont(font);
		moneyLabel.setForeground(Color.BLACK);
	    moneyLabel.setLocation(530,55);
		moneyLabel.setSize(150,30);
		this.add(moneyLabel);
//年龄		
		ageLabel=new JLabel(role.getAge()+"歲");
		ageLabel.setFont(font);
		ageLabel.setForeground(Color.BLACK);
	    ageLabel.setLocation(800,14);
		ageLabel.setSize(150,30);
		this.add(ageLabel);
//日期		
		dateLabel=new JLabel(date.getMonthStr()+date.getDayStr());
		dateLabel.setFont(font);
		dateLabel.setForeground(Color.BLACK);
	    dateLabel.setLocation(800,55);
		dateLabel.setSize(150,30);
		this.add(dateLabel);

//姓名
		String nameContent=role.getName();
		if(role.getGender()==0){
			nameContent+=" 少侠";
		}else{
			nameContent+=" 女侠 ";
		}
		nameLabel=new JLabel(nameContent);
		nameLabel.setFont(font);
		nameLabel.setForeground(Color.BLACK);
	    nameLabel.setLocation(320,14);
		nameLabel.setSize(240,30);
		this.add(nameLabel);
		
		saveDataButton.setSize(230, 47);
		saveDataButton.setLocation(10,740);
		this.add(saveDataButton);
		
		
		loadDataButton.setSize(230, 47);
		loadDataButton.setLocation(745,740);
		this.add(loadDataButton);
		
		TavernPlaceButton taverbutton=new TavernPlaceButton();
		taverbutton.setSize(66,286);
		taverbutton.setLocation(860,380);
		this.add(taverbutton);
		
		
		ResidencePlaceButton residenceButton=new ResidencePlaceButton();
		residenceButton.setSize(66,286);
		residenceButton.setLocation(750,380);
		this.add(residenceButton);
		
		
		
		
	}
	public void paintComponent(Graphics g){		
		super.paintComponent(g);
		g.drawImage(backIcon.getImage(), 0,0,1000,800,null);
		g.drawImage(headIcon.getImage(), 0,0,144,153,null);
		 
	}

	public void addPlace(){
		for(int i=0;i<placeButton.length;i++){
			placeButton[i].setSize(66,286);
			placeButton[i].setLocation(860-i*110,380);
			this.add(placeButton[i]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.setSize(1000, 835);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScenePanel s=new ScenePanel("image/changAn/changAnMap.png");
		f.add(s);
		f.setVisible(true);
		
	}
}
