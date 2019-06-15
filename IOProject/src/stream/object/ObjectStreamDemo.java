package stream.object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamDemo {

	public static void main(String[] args) {
         Player player1 = new Player("Kill7", "99");
         
         FileOutputStream fileOutputStream =null;
         ObjectOutputStream objectOutputStream=null;
		try {
			fileOutputStream = new FileOutputStream("D:\\eclipse-workspace\\IOProject\\src\\stream\\object\\Object.dat");
			  objectOutputStream = new ObjectOutputStream(fileOutputStream);
			 
			 objectOutputStream.writeObject(player1);
			 System.out.println("Done Object write");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				objectOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
         FileInputStream fileInputStream = null;
         ObjectInputStream objectInputStream = null;
         try {
			fileInputStream = new FileInputStream("D:\\eclipse-workspace\\IOProject\\src\\stream\\object\\Object.dat");
		    objectInputStream= new ObjectInputStream(fileInputStream);
		  Player player2 = (Player)objectInputStream.readObject();
		  System.out.println(player2);
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				objectInputStream.close();
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
  
         
	}

}

class Player implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3228750699247436445L;
	private String name;
	private String level;
	
	
	public Player() {}
	
	public Player(String name, String level) {
		setName(name);
		setLevel(level);
	}
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", level=" + level + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
}
