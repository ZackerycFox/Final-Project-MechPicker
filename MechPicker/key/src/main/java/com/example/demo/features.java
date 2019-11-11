package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class features {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int id; 
	boolean lighting; 
	boolean rgb_lighting; 
	boolean wireless; 
	boolean media_controls;
	boolean macro_keys;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isLighting() {
		return lighting;
	}
	public void setLighting(boolean lighting) {
		this.lighting = lighting;
	}
	public boolean isRgb_lighting() {
		return rgb_lighting;
	}
	public void setRgb_lighting(boolean rgb_lighting) {
		this.rgb_lighting = rgb_lighting;
	}
	public boolean isWireless() {
		return wireless;
	}
	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	public boolean isMedia_controls() {
		return media_controls;
	}
	public void setMedia_controls(boolean media_controls) {
		this.media_controls = media_controls;
	}
	public boolean isMacro_keys() {
		return macro_keys;
	}
	public void setMacro_keys(boolean macro_keys) {
		this.macro_keys = macro_keys;
	} 
	
}