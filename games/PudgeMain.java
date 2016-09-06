package home.mass.games;

import java.io.*;

public class PudgeMain {

	public static void main(String[] args) {
		Pudge pudge = new Pudge();
		Pudge pudge2;
//		pudge.getName() = "Drow Ranger";
		pudge.getP();
		Pudge pudge3 = new Pudge("ffd", "dfsdf");
		System.out.println(pudge3.getName());
		pudge3.getSlot();
		ObjectOutputStream oos = null;
		/*try {
			oos = new ObjectOutputStream(new FileOutputStream("D://!Pudge_s.ser"));
			oos.writeObject(pudge);
			oos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Write End");
		System.out.println("Read Start");
		ObjectInputStream ois = null;
		Pudge ser = null;
		try{
			ois = new ObjectInputStream(new FileInputStream("D://!Pudge_s.ser"));
			ser =  (Pudge) ois.readObject();
			ois.close();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		ser.getP();*/
		try(FileReader fr=new FileReader("D:\\Axe.xml")) {
			int c;
			int rowCounter = 0;
			StringBuilder sb=new StringBuilder();
			while((c=fr.read())!=-1){
				sb.append((char)c);
			}
			String name = sb.toString().substring(sb.toString().indexOf("<name>")+6,sb.toString().indexOf("</name>"));
			String slot = sb.toString().substring(sb.toString().indexOf("<slot>")+6,sb.toString().indexOf("</slot>"));
			pudge2 = new Pudge(name, slot);
			pudge2.getP();
		} catch ( IOException e) {
			e.printStackTrace();
		}
	}

}
