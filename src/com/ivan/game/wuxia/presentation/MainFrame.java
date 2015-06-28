package com.ivan.game.wuxia.presentation;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ivan.game.wuxia.model.DataHelper;
import com.ivan.game.wuxia.model.Role;

public class MainFrame extends JFrame{
	/*
	 * 窗口大小变量
	 */
	DataHelper datahelper=DataHelper.getInstance();
	public static int w=1000;
	public static int h=835;
	CardLayout cl=new CardLayout();
	JButton startButton;
	JButton loadButton;
	JButton quitButton;
	Font font=new Font("中國龍淡古體",Font.PLAIN,20);
	/*
	 * 按钮声明
	 */
	ImageIcon startIcon[]={
			new ImageIcon("image/lauch/start.png"),
			new ImageIcon("image/lauch/start_hover.png"),
			new ImageIcon("image/lauch/start_pressed.png")			
	};
	ImageIcon quitIcon[]={
			new ImageIcon("image/lauch/quit.png"),
			new ImageIcon("image/lauch/quit_hover.png"),
			new ImageIcon("image/lauch/quit_pressed.png")			
	};
	ImageIcon loadIcon[]={
			new ImageIcon("image/lauch/load.png"),
			new ImageIcon("image/lauch/load_hover.png"),
			new ImageIcon("image/lauch/load_pressed.png")			
	};
	BackPanel backPanel=new BackPanel();
	CreatePanel createPanel=new CreatePanel();
	
	Container container=new Container();
	static MainFrame instance=null;
	
	public static MainFrame getInstance(){
		if(instance==null){
			instance=new MainFrame();
		}
		return instance;
		
		
	}
	private MainFrame(){
		super("江湖往事");
		this.setSize(w, h);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(cl);
		container=this.getContentPane();
		container.setLayout(cl);
		//放入背景图片
		
		backPanel.setBounds(0, 0, w, h);
		
		//初始化按钮们
		
		startButton=new JButton(startIcon[0]);
		loadButton=new JButton(loadIcon[0]);
		quitButton=new JButton(quitIcon[0]);
	
		
		backPanel.add(startButton);
		backPanel.add(loadButton);	
		backPanel.add(quitButton);
		
		container.add(backPanel,"backPanel");		
		
		/*
		 * 以下為創建人物界面panel的定義
		 */
		
		container.add(createPanel,"createPanel");
		
		
		
		
		startButton.setBounds(350,400,313,58);
		loadButton.setBounds(350,470,313,58);
		quitButton.setBounds(350,540,313,58);
		init();
		this.setLocationRelativeTo(null); //设置窗口居中		
		this.setVisible(true);
		
		
		
	}
	public void init(){
		
		/*
		 * 用来添加监听器
		 */
		startButton.setContentAreaFilled(false);		
		startButton.setBorderPainted(false);		
		startButton.addMouseListener(new MouseAdapter(){
			   //鼠标点击事件
			   public void mouseClicked(MouseEvent e){	
				   System.out.println("点击初涉江湖");
				   cl.show(container, "createPanel");
				   
			   }	
			 //鼠标点击事件
			   public void mousePressed(MouseEvent e){
				   startButton.setIcon(startIcon[2]);
			   }	
			    //鼠标释放事件
			    public void mouseReleased(MouseEvent e){
			    	startButton.setIcon(startIcon[0]);
			    }
			    //鼠标进入事件
			    public void mouseEntered(MouseEvent e){
			    	startButton.setIcon(startIcon[1]);
			    }
			    //鼠标离开事件
			    public void mouseExited(MouseEvent e){
			    	startButton.setIcon(startIcon[0]);
			    }
		});
		loadButton.setContentAreaFilled(false);		
		loadButton.setBorderPainted(false);		
		loadButton.addMouseListener(new MouseAdapter(){
			   //鼠标点击事件
			   public void mouseClicked(MouseEvent e){
				   System.out.println("点击再踏征途");
				   datahelper.open();
				   Role role=datahelper.getRole();
				   System.out.println(role.getName()+" "+role.getGender());
				   
			   }	
			 //鼠标点击事件
			   public void mousePressed(MouseEvent e){
				   loadButton.setIcon(loadIcon[2]);
			   }	
			    //鼠标释放事件
			    public void mouseReleased(MouseEvent e){
			    	loadButton.setIcon(loadIcon[0]);
			    }
			    //鼠标进入事件
			    public void mouseEntered(MouseEvent e){
			    	loadButton.setIcon(loadIcon[1]);
			    }
			    //鼠标离开事件
			    public void mouseExited(MouseEvent e){
			    	loadButton.setIcon(loadIcon[0]);
			    }
		});
		quitButton.setContentAreaFilled(false);		
		quitButton.setBorderPainted(false);		
		quitButton.addMouseListener(new MouseAdapter(){
			   //鼠标点击事件
			   public void mouseClicked(MouseEvent e){
				   System.out.println("点击退出江湖");
			   }	
			 //鼠标点击事件
			   public void mousePressed(MouseEvent e){
				   quitButton.setIcon(quitIcon[2]);
			   }	
			    //鼠标释放事件
			    public void mouseReleased(MouseEvent e){
			    	quitButton.setIcon(quitIcon[0]);
			    }
			    //鼠标进入事件
			    public void mouseEntered(MouseEvent e){
			    	quitButton.setIcon(quitIcon[1]);
			    }
			    //鼠标离开事件
			    public void mouseExited(MouseEvent e){
			    	quitButton.setIcon(quitIcon[0]);
			    }
		});
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mf=MainFrame.getInstance();
	
		
		
	}

}
class BackPanel extends JPanel{
	
	public BackPanel(){
		this.setLayout(null);
	}
	ImageIcon backIcon=new ImageIcon("image/lauch/back.png");
	public void paintComponent(Graphics g){				
		g.drawImage(backIcon.getImage(), 0,0,1000,800,null);
		
	}
	
}