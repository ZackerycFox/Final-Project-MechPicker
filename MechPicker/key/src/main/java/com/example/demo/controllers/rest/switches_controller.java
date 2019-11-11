package com.example.demo.controllers.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.switch_interface;
import com.example.demo.switches;

import com.example.demo.manufacture_interface;
import com.example.demo.models;
import com.example.demo.models_interface;
import com.example.demo.sku;
import com.example.demo.sku_interface;
import com.example.demo.feature_sets;
import com.example.demo.feature_sets_interface;
import com.example.demo.features;
import com.example.demo.features_interface;
import com.example.demo.manufacture;

@RestController
public class switches_controller {
	
	@Autowired
	switch_interface switchPick; 

	@Autowired
	manufacture_interface ManuPick;
	
	@Autowired
	models_interface modelsPick;
	
	@Autowired
	features_interface featPick;
	
	@Autowired
	feature_sets_interface featsetPick;
	
	@Autowired
	sku_interface skuPick; 
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/")
	public String hello() {
		return "";
	}

	@CrossOrigin(origins="*")
	@GetMapping(value = "/Checkon")
	public String Check() {
		return "hello world !"; 
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/manufacture")
	public Iterable<manufacture>  manufacture() {
		return ManuPick.findAll() ; 
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/switch")
	public Iterable<switches> switches() {
		return switchPick.findAll(); 
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/switch/{id}")
	public Optional<switches> NewMETHOD(@PathVariable("id") int id) {
		return switchPick.findById(id);	
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/manufacture/{id}")
	public Optional<manufacture> NewMETHODm(@PathVariable("id") int id) {
		return ManuPick.findById(id);	
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/{id}")
	public Optional<models> NewMETHODmod(@PathVariable("id") int id) {
		return modelsPick.findById(id);	
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/model")
	public Iterable<models> NewMETHODmod() {
		return modelsPick.findAll();	
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/features/{id}")
	public Optional<features> NewMETHODfeat(@PathVariable("id") int id) {
		return featPick.findById(id);
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/feature_sets/{id}")
	public Optional<feature_sets> NewMETHODfeatset(@PathVariable("id") int id) {
		return featsetPick.findById(id);	
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/{id}")
	public Optional<sku> NewMETHODsku(@PathVariable("id") int id) {
		return skuPick.findById(id);
	}
	
	//Starting the Selection Process
	
	//Fullsized Options
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/fullsized")
	public List<sku> NewMETHODfullsized() {
		return skuPick.findByfullsized();
	} 
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/fullsized/clicky")
	public List<sku> NewMETHODfullClick() {
		return skuPick.findByfullClick();
	} 
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/fullsized/silent")
	public List<sku> NewMETHODfullSilent() {
		return skuPick.findByfullSilent();
	}
	
	//TKL Options
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/tkl")
	public List<sku> NewMETHODtkl() {
		return skuPick.findBytkl();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/tkl/clicky")
	public List<sku> NewMETHODtklClick() {
		return skuPick.findBytklClick();
	} 
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/tkl/silent")
	public List<sku> NewMETHODtklSilent() {
		return skuPick.findBytklSilent(); 
	} 
	
	//Sixty Options
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/sixty")
	public List<sku> NewMETHODsixty() {
		return skuPick.findBysix();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/sixty/clicky")
	public List<sku> NewMETHODsixClick() {
		return skuPick.findBysixClick();
	} 
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/models/sixty/silent")
	public List<sku> NewMETHODsixSilent() {
		return skuPick.findBysixSilent();
	}
	
	//Selecting by Switch Sound
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/switches/clicky")
	public List<sku> NewMETHODclicky() {
		return skuPick.findByclick();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/sku/switches/silent")
	public List<sku> NewMETHODsilent() {
		return skuPick.findBysilent();
	}
	 
	//Selecting by Manufacture
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/2")
	public List<models> NewMETHODcorsair() {
		return modelsPick.findByCorsair();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/3")
	public List<models> NewMETHODcoolermaster() {
		return modelsPick.findByCoolerMaster();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/4")
	public List<models> NewMETHODhyperx() {
		return modelsPick.findByHyperX();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/6")
	public List<models> NewMETHODlogitech() {
		return modelsPick.findByLogitech();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/7")
	public List<models> NewMETHODRazer() {
		return modelsPick.findByRazer();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/8")
	public List<models> NewMETHODanne() {
		return modelsPick.findByAnne();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/9")
	public List<models> NewMETHODmassdrop() {
		return modelsPick.findByMassdrop();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/11")
	public List<models> NewMETHODducky() {
		return modelsPick.findByDucky();
	}
	
	@CrossOrigin(origins="*")
	@GetMapping(value = "/models/manufacture_id/12")
	public List<models> NewMETHODvortex() {
		return modelsPick.findByVortex();
	}
	
	
	//End of Selection Gets
	
	
	
	//Deleting sku or a model
	
	@CrossOrigin(origins="*")
	@DeleteMapping(value = "/models/{id}")
	public void deleteModels(@PathVariable("id")int id){
		modelsPick.deleteModid(id);
		}
	
	@CrossOrigin(origins="*")
	@DeleteMapping(value = "/sku/{id}")
	public void deleteSku(@PathVariable("id")int id){
		skuPick.deleteSkuid(id);
		}
	
	//Adding a New Switch or Model
	
	@CrossOrigin(origins="*")
	@PostMapping(value = "/newswitch/{brand}&{type}&{tactile}&{clicky}&{linear}&{silent}&{switch_pic}&{switch_sound}")
	public void postNewSwitch(@PathVariable("brand")String brand,
			@PathVariable("type")String type, 
			@PathVariable("tactile")boolean tactile, 
			@PathVariable("clicky")boolean clicky, 
			@PathVariable("linear")boolean linear,
			@PathVariable("silent")boolean silent, 
			@PathVariable("switch_pic")String switch_pic,
			@PathVariable("switch_sound")String switch_sound) {
		switchPick.postNewswitch(brand, type, tactile, clicky, linear, silent, switch_pic, switch_sound);
		} 
	
	@CrossOrigin(origins="*")
	@PostMapping(value = "/newmodel/{model}/{fullsized}/{tkl}/{sixty}/{price}/{manufacture_id}/{keyboard_pic}")
	public void postNewModel(@PathVariable("model")String model,
			@PathVariable("fullsized")boolean fullsized, 
			@PathVariable("tkl")boolean tkl, 
			@PathVariable("sixty")boolean sixty, 
			@PathVariable("price")int price,
			@PathVariable("manufacture_id")int manufacture_id, 
			@PathVariable("keyboard_pic")String keyboard_pic) {
		modelsPick.postNewModel(model, fullsized, tkl, sixty, price, manufacture_id, keyboard_pic);
		} 
	
}