package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class switches {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	
	int id; 
	String brand; 
	String type; 
	boolean tactile; 
	boolean clicky; 
	boolean linear; 
	boolean silent;
	String switch_pic; 
	String switch_sound; 
	
	
	
	
	
	public String getSwitch_pic() {
		return switch_pic;
	}
	public void setSwitch_pic(String switch_pic) {
		this.switch_pic = switch_pic;
	}
	public String getSwitch_sound() {
		return switch_sound;
	}
	public void setSwitch_sound(String switch_sound) {
		this.switch_sound = switch_sound;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isTactile() {
		return tactile;
	}
	public void setTactile(boolean tactile) {
		this.tactile = tactile;
	}
	public boolean isClicky() {
		return clicky;
	}
	public void setClicky(boolean clicky) {
		this.clicky = clicky;
	}
	public boolean isLinear() {
		return linear;
	}
	public void setLinear(boolean linear) {
		this.linear = linear;
	}
	public boolean isSilent() {
		return silent;
	}
	public void setSilent(boolean silent) {
		this.silent = silent;
	}
	
	

}
