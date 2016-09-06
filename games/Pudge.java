package home.mass.games;

import java.io.Serializable;

public class Pudge implements Serializable{
	private String name = "Pudge";
	private String slot = "BootsOfSpeed";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public Pudge(String name, String slot) {
		this.slot = slot;
		this.name = name;
	}
	public Pudge() {
		// TODO Auto-generated constructor stub
	}
	
	public void getP(){
		System.out.println("Name: "+name+ "; slot: "+slot);
	}
}
