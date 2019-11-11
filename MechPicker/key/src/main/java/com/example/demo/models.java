package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class models {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int id; 
	int manufacture_id; 
	boolean fullsized; 
	boolean tkl; 
	boolean sixty; 
	int price; 
	String keyboard_pic; 
	String model;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getManufacture_id() {
		return manufacture_id;
	}
	public void setManufacture_id(int manufacture_id) {
		this.manufacture_id = manufacture_id;
	}
	public boolean isFull() {
		return fullsized;
	}
	public void setFull(boolean full) {
		this.fullsized = full;
	}
	public boolean isTkl() {
		return tkl;
	}
	public void setTkl(boolean tkl) {
		this.tkl = tkl;
	}
	public boolean isSixty() {
		return sixty;
	}
	public void setSixty(boolean sixty) {
		this.sixty = sixty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKeyboard_pic() {
		return keyboard_pic;
	}
	public void setKeyboard_pic(String keyboard_pic) {
		this.keyboard_pic = keyboard_pic;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	} 
	
	
	
}
