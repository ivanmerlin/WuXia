package com.ivan.game.wuxia.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DataHelper {
	
	
	String path="data.txt";
	Role role;
	Bag bag;
	Date date;
	private static DataHelper single=null;
	private DataHelper(){}
	
	
	 
	
	public static DataHelper getInstance(){
		if (single==null){
			single=new DataHelper();
		}
		return single;
		
	}
	
	
	
	public void save( ){   
        FileOutputStream fos = null;  
        ObjectOutputStream oos = null;  
        File f = new File(path);  
        try {  
            fos = new FileOutputStream(f);  
            oos = new ObjectOutputStream(fos);  
            oos.writeObject(role);    //括号内参数为要保存java对象  
            oos.writeObject(bag);
            oos.writeObject(date);
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }finally{  
            try {  
                oos.close();  
                fos.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }     
    }  
      
	public void open( ){  
        FileInputStream fis = null;  
        ObjectInputStream ois = null;     
        File f = new File(path);  
        try {  
            fis = new FileInputStream(f);  
            ois = new ObjectInputStream(fis);  
            role= (Role)ois.readObject();//强制类型转换  
            bag=(Bag) ois.readObject();
            date=  ( Date)ois.readObject();
            System.out.println(date.getMonthStr()+date.getDayStr());
            System.out.println(bag.getMoney());
            
           // myPanel.repaint();  
              
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } catch (ClassNotFoundException e) {  
            e.printStackTrace();  
        }finally{  
            try {  
                ois.close();  
                fis.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}




	public Bag getBag() {
		return bag;
	}




	public void setBag(Bag bag) {
		this.bag = bag;
	}




	public Date getDate() {
		return date;
	}




	public void setDate(Date date) {
		this.date = date;
	}
    
    
    
}
