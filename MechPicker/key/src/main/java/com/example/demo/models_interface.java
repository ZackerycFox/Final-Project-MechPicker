package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface models_interface extends CrudRepository <models, Integer> {
	
	List<models> findByid(int id);
	List<models> findBymodel(String model); 
	List<models> findByfullsized(boolean fullsized);
	List<models> findBytkl(boolean tkl); 
	List<models> findBysixty(boolean sixty);
	List<models> findByprice(int price);
	
	@Query(value = "select * from models where manufacture_id = :manid", nativeQuery = true)
	List<models> findBymanufacture_id(int manid);
	
	@Query(value = "select * from models where keyboard_pic = :keypic", nativeQuery = true)
	List<models> findBykeyboard_pic(String keypic);
	
	//Find Corsair Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 2 )", nativeQuery = true)
	List<models> findByCorsair();

	//Find CoolerMaster Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 3 )", nativeQuery = true)
	List<models> findByCoolerMaster();
		
	//Find HyperX Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 4 )", nativeQuery = true)
	List<models> findByHyperX();
		
	//Find Logitech Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 6 )", nativeQuery = true)
	List<models> findByLogitech();
	
	//Find Razer Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 7 )", nativeQuery = true)
	List<models> findByRazer();
		
	//Find Anne Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 8 )", nativeQuery = true)
	List<models> findByAnne();
		
	//Find Massdrop Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 9 )", nativeQuery = true)
	List<models> findByMassdrop();
	
	//Find Ducky Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 11 )", nativeQuery = true)
	List<models> findByDucky();
		
	//Find Vortex Models
	@Query(value = "select * from models where manufacture_id in (select id from manufacture where id = 12 )", nativeQuery = true)
	List<models> findByVortex();
		
	
	@Modifying
	@Transactional
	@Query(value = "insert into models (model, fullsized, tkl, sixty, price, manufacture_id, keyboard_pic) values(:newmodel, :newfullsized, :newtkl,"
			+ " :newsixty, :newprice, :newmanufacture_id, :newkeyboard_pic)", nativeQuery = true)
	void postNewModel(String newmodel, boolean newfullsized, boolean newtkl, boolean newsixty, int newprice, int newmanufacture_id, String newkeyboard_pic);
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM models WHERE (id)", nativeQuery = true)
	void deleteModid(int id);



}